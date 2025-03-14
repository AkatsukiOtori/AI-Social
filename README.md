# AI-Social

## Structure

    src/main/java
    ├── controller
    │   ├── ChatController.java
    │   └── MemoryController.java
    ├── service
    │   ├── AIService.java
    │   ├── MemoryService.java
    │   └── OCRService.java
    ├── model
    │   ├── ChatRequest.java
    │   ├── MemoryEntry.java
    │   └── UserMemory.java
    ├── repository
    |   ├── UserMemoryRepository.java
    └── Application.java

## 项目启动

启动不了，Spring Boot没搭好

## API接口调动

要调用的接口有三个：OCR，LLM，MongoDB（如果用MongoDB的话），LLM和MongoDB的调用我用过Python版本的，没法直接移植过来，如果你需要的话我把我之前的Repo分享给你

## 长期记忆存储和调用

我之前用的方法是把数据库的Memory定期发送到LLM进行总结，把记忆的list不断缩短，调用的时候只调用最后三条加上总结文本
    