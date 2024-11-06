package org.example.ProductCatelogService.service;

import org.example.ProductCatelogService.dtos.ProductDto;
import org.example.ProductCatelogService.entities.Product;
import org.example.ProductCatelogService.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class StorageProductService implements IProductService {

    private  ProductRepo productRepo;

    public StorageProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(Long prouctId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        Product resultProduct = productRepo.save(product);
        return resultProduct;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

}
