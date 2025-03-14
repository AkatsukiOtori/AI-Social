import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryService {
    private final Map<String, String> memoryMap = new HashMap<>();
    private final Map<String, LocalDateTime> timestamps = new HashMap<>();

    public void addMemory(String key, String content) {
        memoryMap.put(key, content);
        timestamps.put(key, LocalDateTime.now());
    }

    public String getMemory(String key) {
        LocalDateTime timestamp = timestamps.get(key);
        return timestamp != null ? 
            String.format("[%s] %s", timestamp, memoryMap.get(key)) : 
            "Memory not found";
    }

    public void removeMemory(String key) {
        memoryMap.remove(key);
        timestamps.remove(key);
    }
    
    public List<String> getAllMemories() {
        return timestamps.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .map(entry -> String.format("%s: %s", 
                 entry.getKey(), 
                 getMemory(entry.getKey())))
            .toList();
    }
}
