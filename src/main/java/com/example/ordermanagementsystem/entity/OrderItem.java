package com.example.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private Integer quantity;

    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
