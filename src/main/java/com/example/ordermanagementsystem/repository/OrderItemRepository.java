package com.example.ordermanagementsystem.repository;

import com.example.ordermanagementsystem.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
