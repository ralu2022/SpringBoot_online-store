package com.example.flowershop.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    private String role;

    @OneToMany
    @ToString.Exclude
    List<Delivery> deliveries;
}
