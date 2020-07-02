package org.dcb.spring101.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "hello world";
    }
}
