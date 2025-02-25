package com.example.flowershop.repository;


import com.example.flowershop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
    List<Product>findAllBy(String name);


}