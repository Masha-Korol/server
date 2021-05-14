package com.example.server;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class Controller {

    private final SomeService service;

    public Controller(SomeService service) {
        this.service = service;
    }

    @GetMapping("/")
    public Model method() {
        return this.service.method();
    }
}
