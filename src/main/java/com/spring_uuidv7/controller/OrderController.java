package com.spring_uuidv7.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

import com.spring_uuidv7.entity.Order;
import com.spring_uuidv7.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order create(@RequestBody Order order) {

        return service.save(order);

    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable UUID id){
        return service.findById(id);

    }
    
    @GetMapping
    public List<Order> findAll() {
        return service.findAll();
    }

}
