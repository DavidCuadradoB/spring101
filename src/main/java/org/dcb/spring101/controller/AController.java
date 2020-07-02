package org.dcb.spring101.controller;


import org.dcb.spring101.service.BestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    private final String myFirstBean;
    private final BestService bestService;

    @Autowired
    public AController(String myFirstBean, BestService bestService) {
        this.myFirstBean = myFirstBean;
        this.bestService = bestService;
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        return myFirstBean;
    }

    @GetMapping("/best")
    public String getBestService() {
        return bestService.theBestMethod();
    }
}
