package com.bidyut.movieinfoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
    @GetMapping("/")
    public String init(){
        return "Movie info service is up!";
    }
}
