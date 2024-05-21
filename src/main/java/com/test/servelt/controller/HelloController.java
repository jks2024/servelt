package com.test.servelt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-jsp")
    public String helloJsp(){
        return "hello";
    }
}
