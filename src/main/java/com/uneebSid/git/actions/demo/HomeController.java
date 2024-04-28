package com.uneebSid.git.actions.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String index()
    {
        return "Hello from the spring app";
    }
}
