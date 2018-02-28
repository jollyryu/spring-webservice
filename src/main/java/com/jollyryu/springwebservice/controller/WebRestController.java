package com.jollyryu.springwebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
    @GetMapping
    public String hello() {
        return "Hello";
    }

    @GetMapping
    public void requestTest() {
        return null
    }

}
