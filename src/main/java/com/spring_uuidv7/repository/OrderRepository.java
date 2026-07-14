package com.spring_uuidv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_uuidv7.entity.Order;

import java.util.UUID;

public interface OrderRepository
        extends JpaRepository<Order, UUID> {
}
