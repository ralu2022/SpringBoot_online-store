package com.example.flowershop.model.dto;

import com.example.flowershop.model.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
@Data
public class ProductDto {
    @Length(min = 10, max= 100)
    @NotNull
    private String name;
    @NotNull
    private int price;
    @NotNull
    private int stock;
    private String description;


    public Product toObject(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setStock(productDto.getStock());
        product.setDescription(productDto.getDescription());
        return product;
    }
}
