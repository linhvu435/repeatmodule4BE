package com.example.repeatmodule4.service;

import com.example.repeatmodule4.model.Product;
import com.example.repeatmodule4.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  {
    @Autowired
    IProductRepo iProductRepo;


    public Page<Product> getAll(Pageable pageable) {
        return (Page<Product>) iProductRepo.findAll(pageable);
    }

    public void delete(long id) {
        iProductRepo.deleteById(id);
    }


    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }

    public Product save(Product product) {
        return iProductRepo.save(product);
    }


    public List<Product> findByName(String name) {
        return iProductRepo.findByName(name);
    }

    public Page<Product> findProductShop(long id,Pageable pageable){
        return iProductRepo.productShop(id,pageable);
    }
}
