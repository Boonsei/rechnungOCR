package com.example.rechnungsBackend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@FeignClient(name = "ollamaClient", url = "http://localhost:11434")
public interface OllamaClient {

    @PostMapping("/api/generate")
    @ResponseBody
    Map<String, Object> generateResponse(@RequestBody Map<String, Object> request);
}
