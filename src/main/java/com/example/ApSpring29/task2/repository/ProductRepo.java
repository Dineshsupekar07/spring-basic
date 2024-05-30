package com.example.ApSpring29.task2.repository;

import com.example.ApSpring29.task2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
