@RestController
@RequestMapping("/api/users/{userId}/memory")
public class MemoryController {
    private final MemoryService memoryService;

    @GetMapping
    public ResponseEntity<UserMemory> getMemory(@PathVariable String userId) {
        return ResponseEntity.ok(memoryService.getMemory(userId));
    }
}