package com.example.repeatmodule4.controller;

import com.example.repeatmodule4.model.Product;
import com.example.repeatmodule4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("user/products")
public class UserController {
    @Autowired
    ProductService productService;

    @GetMapping
    public Page<Product> getAll( @RequestParam(defaultValue = "0") int page) {
        Page<Product> products = productService.getAll(PageRequest.of(page, 2));
        return products;
    }
}