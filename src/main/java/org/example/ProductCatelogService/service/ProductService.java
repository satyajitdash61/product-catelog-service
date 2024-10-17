package org.example.ProductCatelogService.service;

import org.example.ProductCatelogService.dtos.FakeStoreProductDto;
import org.example.ProductCatelogService.dtos.ProductDto;
import org.example.ProductCatelogService.models.Category;
import org.example.ProductCatelogService.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private RestTemplateBuilder restTemplateBuilder;

    public ProductService(RestTemplateBuilder restTemplateBuilder){
    this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public List<Product> getAllProducts(){ return null; }
    @Override
    public Product getProduct(Long prouctId){
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForEntity("https://fakestoreapi.com/products/{id}", FakeStoreProductDto.class, prouctId).getBody();
        return getProduct(fakeStoreProductDto);
    }
    @Override
    public ProductDto createProduct(ProductDto productDto){ return null; }

    private Product getProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setName(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImageUrl(fakeStoreProductDto.getImage());
        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory((category));
        return product;

    }
}
