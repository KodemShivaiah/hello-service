package com.hello.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String showHelloWorld(){
        return "Hello World";
    }

    @PostMapping
    public String showHelloWorldPost(){
        return "Hello World Mr. XYZ";
    }

}
