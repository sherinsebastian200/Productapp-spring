package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String Welcomepage()
    {
        return "Welcome to ProductApp home";
    }











}
