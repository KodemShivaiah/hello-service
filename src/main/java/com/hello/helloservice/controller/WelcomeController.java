package com.hello.helloservice.controller;

import com.hello.helloservice.model.EmpDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public String showHelloWorld(){
        return "Welcome";
    }

    @GetMapping("/2")
    public String showHelloWorld2(@RequestParam("name") String name){
        return "Welcome Mr./Miss. : "+name;
    }


    @PostMapping
    public String showHelloWorldPost(@RequestBody String emp){
        System.out.println("Employee Details");
        System.out.println(emp.toString());
        return "Welcome to our first application Mr. XYZ";
    }

    //@RequestMapping(name = "/emp", method = RequestMethod.POST)
    @PostMapping("/emp")
    public String showHelloWorldPost(@RequestBody EmpDetails emp){
        System.out.println("Employee Details");
        System.out.println(emp.toString());
        return "Welcome to our first application Mr. XYZ";
    }


    @PostMapping("/emp-return")
    public EmpDetails showHelloWorldPostReturn(@RequestBody EmpDetails emp){
        System.out.println("Employee Details");
        System.out.println(emp.toString());
        return emp;
    }


}
