package com.ecommerce.catalog_service.controller;

import com.ecommerce.catalog_service.model.Category;
import com.ecommerce.catalog_service.model.Product;
import com.ecommerce.catalog_service.service.CatalogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return catalogService.getAllProducts();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return catalogService.createProduct(product);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return catalogService.getAllCategories();
    }
    
    @PostMapping("/categories")
    public Category createCategry(@RequestBody Category category) {
        return catalogService.createCategory(category);
    }

    @GetMapping("/categories/{id}/products")
    public List<Product> getProductsByCategory(@PathVariable Long id) {
        return catalogService.getProductsByCategory(id);
    }
    
}
