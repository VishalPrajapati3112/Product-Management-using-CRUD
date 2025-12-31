package com.example.Product_Management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Product_Management.model.Product;
import com.example.Product_Management.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product updateProduct(Long id, Product product) {
        Product existing = repository.findById(id).orElseThrow();
        existing.setProductName(product.getProductName());
        existing.setPrice(product.getPrice());
        return repository.save(existing);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
