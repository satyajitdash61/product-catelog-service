package org.example.ProductCatelogService.repositories;

import org.example.ProductCatelogService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//product is what we want to store and Long is the datatype of the primary key

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    Product save(Product product);
}
