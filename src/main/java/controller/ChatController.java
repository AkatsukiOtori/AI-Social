package model;

import service.OCRService;
import service.AIService;
import service.MemoryService;

public class ChatController {

    private OCRService ocrService;
    private AIService aiService;
    private MemoryService memoryService;

    @PostMapping("/process-screenshot")
    public ResponseEntity<?> processScreenshot(@RequestBody ChatRequest request) {
        String text = ocrService.extractText(request.screenshotBase64());
        String memoryContext = memoryService.getMemoryContext(request.userId());
        String response = aiService.generateResponse(text, request.persona(), memoryContext);
        memoryService.updateMemory(request.userId(), 
            "Last interaction: " + text.substring(0, Math.min(20, text.length())));
        return ResponseEntity.ok(Map.of(
            "text", text,
            "response", response
        ));
    }
}
