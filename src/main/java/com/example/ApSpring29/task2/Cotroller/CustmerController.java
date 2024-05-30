package com.example.ApSpring29.task2.Cotroller;

import com.example.ApSpring29.task2.entity.Custmer;
import com.example.ApSpring29.task2.repository.CustmerRepo;
import com.example.ApSpring29.task2.service.CustmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
 public class CustmerController {
     @Autowired

     private CustmerService custmerService;

     @PostMapping("save")

    public Custmer saveCustmer(@RequestBody Custmer custmer){

         return custmerService.saveCustmer(custmer);
     }

     }

