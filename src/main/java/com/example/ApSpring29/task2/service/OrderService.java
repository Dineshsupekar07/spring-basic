package com.example.ApSpring29.task2.service;

import com.example.ApSpring29.task2.entity.OrderTables;
import com.example.ApSpring29.task2.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public OrderTables saveOrder(OrderTables order) {
        return orderRepo.save(order);
    }

    public ResponseEntity<?> get_top_customer(){
        List<Map<String,Object>> getData=orderRepo.findTopCustomer();
        return ResponseEntity.ok(getData);
    }
}
