package com.ricky.springeureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(value="/health")
    public String health() {
        return "OK";
    }
}
