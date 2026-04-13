package com.example.DevopsAssignment7.controller;

import com.example.DevopsAssignment7.model.Product;
import com.example.DevopsAssignment7.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")  // for frontend (optional)
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET all products
    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    // ADD product
    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product added successfully";
    }

    // DELETE product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product deleted successfully";
    }
}