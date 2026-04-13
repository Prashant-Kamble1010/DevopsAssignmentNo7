package com.example.DevopsAssignment7.Repository;

import com.example.DevopsAssignment7.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}