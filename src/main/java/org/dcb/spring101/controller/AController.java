package org.dcb.spring101.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    private final String myFirstBean;

    @Autowired
    public AController(String myFirstBean) {
        this.myFirstBean = myFirstBean;
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        return myFirstBean;
    }

}
