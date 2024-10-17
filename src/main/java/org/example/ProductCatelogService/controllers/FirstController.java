package org.example.ProductCatelogService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String welcome(){
        return "welcome to api";
    }
}
