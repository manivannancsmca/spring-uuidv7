package com.spring_uuidv7.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.management.RuntimeErrorException;

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

    public Order save(Order order) {
        order.setId(uuidGenerator.generate());
        return repository.save(order);

    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(UUID id) {
       return repository.findById(id).orElseThrow( () -> new RuntimeException("no data found" + id));
    }

}
