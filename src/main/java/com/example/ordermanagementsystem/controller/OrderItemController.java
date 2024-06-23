package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.entity.OrderItem;
import com.example.ordermanagementsystem.exception.ResourceNotFoundException;
import com.example.ordermanagementsystem.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-items")
@RequiredArgsConstructor
public class OrderItemController {
    private final OrderItemRepository orderItemRepository;

    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@PathVariable Long id, @RequestBody OrderItem item) {
        OrderItem orderItem = orderItemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("OrderItem not found"));
        orderItem.setProductName(item.getProductName());
        orderItem.setQuantity(item.getQuantity());
        return orderItemRepository.save(orderItem);
    }
}
