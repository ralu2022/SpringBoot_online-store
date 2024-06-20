package com.example.flowershop.service;

import com.example.flowershop.exception.BusinessException;
import com.example.flowershop.model.Product;
import com.example.flowershop.model.dto.ProductDto;
import com.example.flowershop.model.dto.ProductReturnDto;
import com.example.flowershop.model.dto.ProductUpdateDto;
import com.example.flowershop.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductsRepository productsRepository;

    public void createProduct(ProductDto productDto){
        Product product = productDto.toObject(productDto);
        productsRepository.save(product);
    }
    public List<ProductReturnDto> findAll(){
        return productsRepository
                .findAll()
                .stream()
                .map(ProductReturnDto::toDto)
                .toList();
    }

    public Product findbyId(Integer id){
        return productsRepository.findById(id)
                .orElseThrow(()-> new BusinessException("Product not found for id: " + id));
    }

    public void updateProduct(ProductUpdateDto productUpdateDto){
        Product product = findbyId(productUpdateDto.getId());
        product.setName(productUpdateDto.getName());
        product.setPrice(productUpdateDto.getPrice());
        product.setStock(productUpdateDto.getStock());
        product.setDescription(productUpdateDto.getDescription());

        productsRepository.save(product);
    }

    public void deleteProduct(Integer id){
        findbyId(id);
        productsRepository.deleteById(id);
    }
}