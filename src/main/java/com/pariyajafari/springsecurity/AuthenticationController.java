package com.pariyajafari.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @GetMapping("/")
    public String home(){
        return "Hey!";
    }
}
