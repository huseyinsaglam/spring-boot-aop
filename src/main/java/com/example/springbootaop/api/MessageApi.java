package com.example.springbootaop.api;

import com.example.springbootaop.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageApi {

    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<String> getMessage(@RequestBody String param) {
        return ResponseEntity.ok(messageService.messageVer(param));
    }

}
