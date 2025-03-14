package model;

import java.time.LocalDateTime;

public class MemoryEntry { 
    private final String id;
    private final String value;
    private final LocalDateTime timestamp;
    
    public MemoryEntry(String id, String value, LocalDateTime timestamp) {
        this.id = id;
        this.value = value;
        this.timestamp = timestamp;
    }
    
    public String getId() { return id; }
    public String getValue() { return id; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
