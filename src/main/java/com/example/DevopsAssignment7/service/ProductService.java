package com.example.DevopsAssignment7.service;
import com.example.DevopsAssignment7.Repository.ProductRepository;
import com.example.DevopsAssignment7.model.Product;
import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}