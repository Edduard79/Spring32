package com.example.CORS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class Controller {

    @GetMapping
    public String getCustomMessage() {
        return "Hello :D! \nWelcome in my app!";
    }

}
