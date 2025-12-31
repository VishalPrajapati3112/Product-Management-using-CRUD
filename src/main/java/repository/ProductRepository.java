package com.example.Product_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Product_Management.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
