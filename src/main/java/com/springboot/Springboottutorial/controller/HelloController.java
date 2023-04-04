package com.springboot.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)  //or we can use @GetMapping anotation
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to spring boot tutorial";
    }
}
