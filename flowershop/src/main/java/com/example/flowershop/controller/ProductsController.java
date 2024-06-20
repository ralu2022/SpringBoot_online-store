package com.example.flowershop.controller;

import com.example.flowershop.model.dto.ProductDto;
import com.example.flowershop.model.dto.ProductReturnDto;
import com.example.flowershop.model.dto.ProductUpdateDto;
import com.example.flowershop.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductsController {

    private final ProductService productService;

    @GetMapping
    private String getProducts(Model model) {
        List<ProductReturnDto> products = productService.findAll();
        model.addAttribute("products", products);
        model.addAttribute("productDto", new ProductDto());
        return "productsUser";
    }

    @PostMapping
    public String createProduct(@ModelAttribute("productDto") @Valid ProductDto productDto,
                                BindingResult bindingResult,
                                Model model) {
        model.addAttribute("productDto", new ProductDto());
        productService.createProduct(productDto);
        return "redirect:/products";
    }

    @GetMapping("/update-form-product/{id}")
    public String updateProductForm(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("oldProduct", productService.findbyId(id));
        model.addAttribute("productUpdateDto", new ProductUpdateDto());
        return "products/updateForm";
    }

    @PostMapping("update-product")
    public String updateProduct(@ModelAttribute @Valid ProductUpdateDto productUpdateDto,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("oldProduct", productService.findbyId(productUpdateDto.getId()));
            return "products/updateForm";
        }
        productService.updateProduct(productUpdateDto);
        return "redirect:/products";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}