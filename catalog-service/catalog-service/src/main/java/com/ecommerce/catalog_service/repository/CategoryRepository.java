package com.ecommerce.catalog_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.catalog_service.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
