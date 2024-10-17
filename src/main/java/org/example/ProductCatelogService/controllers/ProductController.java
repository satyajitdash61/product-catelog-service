package org.example.ProductCatelogService.controllers;

import org.example.ProductCatelogService.dtos.ProductDto;
import org.example.ProductCatelogService.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<Product> getAllProducts(){
        return null;
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long prouctId){
    Product product = new Product();
    product.setId(prouctId);
    product.setName("Iphone");
    product.setPrice(100000D);
    return product;
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productDto;
    }
}
