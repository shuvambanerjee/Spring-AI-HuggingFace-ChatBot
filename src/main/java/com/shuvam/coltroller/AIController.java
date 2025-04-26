package com.shuvam.coltroller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.huggingface.HuggingfaceChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ai")
@Tag(name = "Hugging Face API", description = "Endpoints for interacting with Hugging Face AI")
public class AIController {


    private final HuggingfaceChatModel chatModel;

    public AIController(HuggingfaceChatModel chatModel) {
        this.chatModel = chatModel;
    }


    @PostMapping("/chat")
    @Operation(summary = "Generate Text", description = "Generates text based on the provided prompt")
    public ResponseEntity<AssistantMessage> chat(@RequestBody String promptText) {
        Prompt prompt = new Prompt(promptText);
        ChatResponse response = chatModel.call(prompt);
        return ResponseEntity.ok(response.getResult().getOutput());
    }

}
