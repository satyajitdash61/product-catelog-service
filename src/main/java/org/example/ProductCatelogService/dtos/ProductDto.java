package org.example.ProductCatelogService.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.ProductCatelogService.models.Category;

@Getter
@Setter
public class ProductDto {
    private String name;
    private String imageUrl;
    private String description;
    private Double price;
    private Category category;
}