package com.github.lucasfo_dev.hello.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")

public class HelloController {
//    private String saudacao = "FIAP - MS: ";
//
//    @GetMapping
//    public ResponseEntity<String> getHello(){
//        String response = "Hello " + saudacao + "API RESTful";
//        return ResponseEntity.ok(response);
//    }

    @GetMapping
    public ResponseEntity<String> getHello(@RequestParam String saudacao){
        String response = "Hello " + saudacao + "API RESTful";
        return ResponseEntity.ok(response);
    }

}
