package org.example.ProductCatelogService.controllers;

import org.example.ProductCatelogService.dtos.ProductDto;
import org.example.ProductCatelogService.models.Product;
import org.example.ProductCatelogService.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private IProductService productService;

    public ProductController(IProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return null;
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long prouctId){
//    Product product = new Product();
//    product.setId(prouctId);
//    product.setName("Iphone");
//    product.setPrice(100000D);
//    return product;
        return productService.getProduct(prouctId);
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productDto;
    }
}
