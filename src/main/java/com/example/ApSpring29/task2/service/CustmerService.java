package com.example.ApSpring29.task2.service;

import com.example.ApSpring29.task2.entity.Custmer;
import com.example.ApSpring29.task2.repository.CustmerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustmerService {
    @Autowired
    private CustmerRepo custmerRepo;

    public Custmer saveCustmer(Custmer custmer) {
        return custmerRepo.save(custmer);
    }




}
