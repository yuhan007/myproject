package com.yuhan007.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
