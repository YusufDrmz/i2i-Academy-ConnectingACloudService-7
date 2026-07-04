package com.i2iacademy.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> getWelcomeMessage() {
        return ResponseEntity.ok("Welcome to i2i Academy");
    }
}