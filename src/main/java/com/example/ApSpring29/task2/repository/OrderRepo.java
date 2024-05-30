package com.example.ApSpring29.task2.repository;

import com.example.ApSpring29.task2.entity.OrderTables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.*;
import java.util.List;
import java.util.Map;

public interface OrderRepo extends JpaRepository<OrderTables,Long> {

    @Query(value = "SELECT * FROM get_top_customer()",nativeQuery = true)
    List<Map<String,Object>> findTopCustomer();


}
