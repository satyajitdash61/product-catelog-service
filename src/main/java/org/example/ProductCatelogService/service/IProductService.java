package org.example.ProductCatelogService.service;

import org.example.ProductCatelogService.dtos.ProductDto;
import org.example.ProductCatelogService.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getProduct(Long prouctId);

    Product createProduct(ProductDto productDto);
}
