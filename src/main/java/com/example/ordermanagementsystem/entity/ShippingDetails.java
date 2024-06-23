package com.example.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class ShippingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @Version
    private Integer version;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
