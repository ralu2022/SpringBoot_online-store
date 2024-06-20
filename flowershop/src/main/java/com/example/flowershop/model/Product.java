package com.example.flowershop.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private int stock;
    private String description;

    @ManyToMany(mappedBy = "products")
    @ToString.Exclude
    private List<Delivery> deliveriesList;

}
