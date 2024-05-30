package com.example.ApSpring29.task2.repository;

import com.example.ApSpring29.task2.entity.Custmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustmerRepo extends JpaRepository<Custmer,Long> {

 }
