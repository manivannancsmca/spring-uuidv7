package com.spring_uuidv7.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_uuidv7.entity.Order;
import com.spring_uuidv7.repository.OrderRepository;
import com.spring_uuidv7.util.UuidGenerator;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    private final UuidGenerator uuidGenerator;

    public Order save(Order order){

        order.setId(uuidGenerator.generate());
        return repository.save(order);

    }

    public List<Order> finaAll() {
        return repository.findAll();
    }

}
