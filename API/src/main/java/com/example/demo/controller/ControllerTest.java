package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class ControllerTest {

    @GetMapping
    public String getTeste(){
        return "TROXA e o bagulho é doido ";
    }
}
