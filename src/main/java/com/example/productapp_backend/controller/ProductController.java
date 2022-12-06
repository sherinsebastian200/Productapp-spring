package com.example.productapp_backend.controller;



import com.example.productapp_backend.dao.ProductDao;
import com.example.productapp_backend.model.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String Welcomepage() {
        return "Welcome to ProductApp home";
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String Addcourse(@RequestBody Products p) {

        System.out.println(p.getProduct_code());
        System.out.println(p.getProduct_name().toString());
        System.out.println(p.getManu_date().toString());
        System.out.println(p.getExp_date().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getCeller_name().toString());
        System.out.println(p.getDistributor_name().toString());
        dao.save(p);

        return "products added successfully";
    }
    @GetMapping("/view")
    public List <Products>viewAll(){
        return (List<Products>)dao.findAll();
    }
}





