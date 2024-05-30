package com.example.ApSpring29.task2.Cotroller;

import com.example.ApSpring29.task2.entity.OrderTables;
import com.example.ApSpring29.task2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("save")

    public OrderTables saveOrder(@RequestBody OrderTables order){
     return  orderService.saveOrder(order);
     }
@GetMapping("get_top_customer")
    ResponseEntity<?> get_top_customer(){
        return orderService.get_top_customer();
    }

}
