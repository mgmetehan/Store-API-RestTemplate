package com.mgmetehan.StoreAPIRestTemplate.controller;

import com.mgmetehan.StoreAPIRestTemplate.model.Product;
import com.mgmetehan.StoreAPIRestTemplate.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
        Product responseBody = productService.createProduct(product);
        return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {
        Product responseBody = productService.getProductById(id);
        return ResponseEntity.ok(responseBody);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable("id") Integer id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
