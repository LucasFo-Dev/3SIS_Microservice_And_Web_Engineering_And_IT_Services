package com.github.lucasfo_dev.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")

public class HelloController {
    private String saudacao = "FIAP - MS: ";

    @GetMapping
    public String getHello(){
        return "Hello " + saudacao + "API RESTful";
    }

}
