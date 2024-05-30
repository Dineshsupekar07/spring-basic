package com.example.ApSpring29.task2.service;

import com.example.ApSpring29.task2.entity.Product;
import com.example.ApSpring29.task2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired

    private ProductRepo productRepo;
    public Product saveProduct(Product product){
         return productRepo.save(product);
    }
}

