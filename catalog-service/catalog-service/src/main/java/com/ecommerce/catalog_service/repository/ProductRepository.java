package com.ecommerce.catalog_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.catalog_service.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByCategoryId(Long catergoryId);
}
