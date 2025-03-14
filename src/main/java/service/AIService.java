package service;

public class AIService {

    // Could also use mapping for persona and prompts
    public String generateResponse(String input, String persona, String memory) {
        String prompt = "Give response for this conversation, your persona is " 
        + persona + " and the context is " + memory;
        String response = "get response from API based on " + prompt;
        // Simulate get response from API (python ver)
        // response = client.chat.completions.create(
        //     model=model_name,
        //     messages=message_to_be_sent
        // )
        // response_text = response.choices[0].message.content.strip()
        return response;
    }

    public String generateSummary(String longMemory) {
        String prompt = "Summary this memory and make a short version of it: " + longMemory;
        String shortMemory = "get short memory from API based on " +prompt;
        //Simulate get response from API
        return shortMemory;
    }

}