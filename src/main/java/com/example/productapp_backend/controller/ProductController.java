package com.example.productapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String Welcomepage()
    {
        return "Welcome to ProductApp home";
    }

    @PostMapping("/add")
    public String Addproducts()
    {
        return "Add products";
    }
    @PostMapping("/search")
    public String Searchproducts()
    {
        return "Products search page";
    }

    @GetMapping("/view")
    public String Viewproducts()
    {
        return "View all product details";
    }

    @PostMapping("/delete")
    public String Deleteproducts()
    {
        return "Delete products";
    }












}
