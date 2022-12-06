package com.hello.helloservice.controller.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String helloMsg(){
        return "Hello";
    }
}
