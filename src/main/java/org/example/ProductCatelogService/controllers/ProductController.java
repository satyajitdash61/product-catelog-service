package org.example.ProductCatelogService.controllers;

import org.example.ProductCatelogService.dtos.ProductDto;
import org.example.ProductCatelogService.entities.Product;
import org.example.ProductCatelogService.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long prouctId){
//    Product product = new Product();
//    product.setId(prouctId);
//    product.setName("Iphone");
//    product.setPrice(100000D);
//    return product;
//        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
//        header.add("called by", "smart frontend");
//        try {
//            if(prouctId < 1){
//                header.add("called by", "Pagal frontend");
//                throw new IllegalArgumentException("id is invalid");
//            }
//            Product product =  productService.getProduct(prouctId);
//            return new ResponseEntity<>(product, header, HttpStatus.OK);
//        }
//        catch (Exception ex){
//            return new ResponseEntity<>(header,HttpStatus.BAD_REQUEST);
//        }
        try{
            if(prouctId < 1){
                throw new IllegalArgumentException("id is invalid");
            }
            Product product =  productService.getProduct(prouctId);
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductDto productDto){
        return productService.createProduct(getProduct(productDto));
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody ProductDto productDto){
        return productService.replaceProduct(id, getProduct(productDto));
    }

//    mapper
    private Product getProduct(ProductDto productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setImageUrl(productDto.getImageUrl());
        product.setCategory(productDto.getCategory());
        return product;
    }


}
