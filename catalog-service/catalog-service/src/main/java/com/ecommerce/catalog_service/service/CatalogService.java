package com.ecommerce.catalog_service.service;

import org.springframework.stereotype.Service;

import com.ecommerce.catalog_service.model.Category;
import com.ecommerce.catalog_service.model.Product;
import com.ecommerce.catalog_service.repository.CategoryRepository;
import com.ecommerce.catalog_service.repository.ProductRepository;

import java.util.List;

@Service
public class CatalogService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public CatalogService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Product> getProductsByCategory(Long categoryId){
        return productRepository.findByCategoryId(categoryId);
    }

}
