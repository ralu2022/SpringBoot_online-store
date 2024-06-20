package com.example.flowershop.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class ShoppingCart {
    private Long id;
    private String descriptionProduct;
    private Double unitPrice;
    private boolean availability;
    private LocalDate dateOfDelivery;
}
