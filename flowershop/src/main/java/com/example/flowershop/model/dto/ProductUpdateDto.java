package com.example.flowershop.model.dto;

import com.example.flowershop.model.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ProductUpdateDto {
    @NotNull
    private int id;
    @Length(min = 5, max = 100)
    @NotNull
    private String name;
    @NotNull
    private int price;
    @NotNull
    private int stock;
    private String description;

    public Product toObject(ProductUpdateDto productUpdateDto) {
        Product product = new Product();
        product.setId(productUpdateDto.getId());
        product.setName(productUpdateDto.getName());
        product.setPrice(productUpdateDto.getPrice());
        product.setStock(productUpdateDto.getStock());
        product.setDescription(productUpdateDto.getDescription());

        return product;
    }

    public static ProductUpdateDto toDto(Product product) {
        ProductUpdateDto productUpdateDto = new ProductUpdateDto();
        productUpdateDto.setId(product.getId());
        productUpdateDto.setName(product.getName());
        productUpdateDto.setPrice(product.getPrice());
        productUpdateDto.setStock(product.getStock());
        productUpdateDto.setDescription(product.getDescription());

        return productUpdateDto;
    }
}
