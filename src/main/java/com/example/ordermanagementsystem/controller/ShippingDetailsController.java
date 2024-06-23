package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.entity.ShippingDetails;
import com.example.ordermanagementsystem.exception.ResourceNotFoundException;
import com.example.ordermanagementsystem.repository.ShippingDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping-details")
@RequiredArgsConstructor
public class ShippingDetailsController {
    private final ShippingDetailsRepository shippingDetailsRepository;

    @PutMapping("/{id}")
    public ShippingDetails updateShippingDetails(@PathVariable Long id, @RequestBody ShippingDetails details) {
        ShippingDetails shippingDetails = shippingDetailsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ShippingDetails not found"));
        shippingDetails.setAddress(details.getAddress());
        return shippingDetailsRepository.save(shippingDetails);
    }
}
