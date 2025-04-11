package com.example.rechnungsBackend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class OllamaController {

    private final OllamaClient ollamaClient;

    public OllamaController(OllamaClient ollamaClient){
        this.ollamaClient = ollamaClient;
    }

    @PostMapping("/process")
    public Map<String, Object> processText(@RequestBody String userInput){
        Map<String, Object> request = new HashMap<>();
        request.put("model", "mistral");
        request.put("prompt", userInput);
        request.put("stream", false);
        System.out.println(request);

        return ollamaClient.generateResponse(request);
    }

    @GetMapping
    public String fetch(){
        return "Fetch is working";
    }

}
