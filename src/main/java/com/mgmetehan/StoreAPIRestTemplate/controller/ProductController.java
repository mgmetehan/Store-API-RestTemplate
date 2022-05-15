package com.mgmetehan.StoreAPIRestTemplate.controller;

import com.mgmetehan.StoreAPIRestTemplate.model.Product;
import com.mgmetehan.StoreAPIRestTemplate.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Metehan Gültekin
 * @Date 15.05.2022
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> responseBody = productService.getAllProducts();
        return ResponseEntity.ok(responseBody);
    }
}
