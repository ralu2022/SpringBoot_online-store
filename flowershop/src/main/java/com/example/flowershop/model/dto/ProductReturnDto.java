package com.example.flowershop.model.dto;


import com.example.flowershop.model.Product;
import lombok.Data;

@Data
public class ProductReturnDto {
    private int id;
    private String name;
    private int price;
    private int stock;
    private String description;

    public static ProductReturnDto toDto(Product product) {

        ProductReturnDto productReturnDto = new ProductReturnDto();
        productReturnDto.setId(product.getId());
        productReturnDto.setName(product.getName());
        productReturnDto.setPrice(product.getPrice());
        productReturnDto.setStock(product.getStock());
        productReturnDto.setDescription(product.getDescription());

        return productReturnDto;
    }
}
