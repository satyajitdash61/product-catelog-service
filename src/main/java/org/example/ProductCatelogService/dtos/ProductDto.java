package org.example.ProductCatelogService.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.ProductCatelogService.entities.Category;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String name;
    private String imageUrl;
    private String description;
    private Double price;
    private Category category;
}
