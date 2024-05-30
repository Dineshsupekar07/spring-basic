package com.example.ApSpring29.task2.Cotroller;

import com.example.ApSpring29.task2.entity.Product;
import com.example.ApSpring29.task2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

}

