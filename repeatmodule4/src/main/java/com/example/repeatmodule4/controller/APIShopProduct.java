package com.example.repeatmodule4.controller;

import com.example.repeatmodule4.model.Product;
import com.example.repeatmodule4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class APIShopProduct {

    @Autowired
    ProductService productService;

    @GetMapping("/home/{id}")
    public Page<Product> getAll(@PathVariable long id ,@RequestParam(defaultValue = "0") int page) {
        Page<Product> products  = productService.findProductShop(id,PageRequest.of(page,2));
        return products;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        return new ResponseEntity<>(productService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        productService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/edit/{id}")
    public ResponseEntity<Product> Edit(@PathVariable long id){
        return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> edit( @RequestBody Product product, @PathVariable Long id) {
        product.setId(id);
        productService.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @GetMapping("/findByName/{name}")
    public ResponseEntity<Iterable<Product>> findByName(@PathVariable String name) {
        return new ResponseEntity<>(productService.findByName(name), HttpStatus.OK);
    }
}

