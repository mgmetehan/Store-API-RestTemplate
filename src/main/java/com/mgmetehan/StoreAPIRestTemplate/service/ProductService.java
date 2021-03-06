package com.mgmetehan.StoreAPIRestTemplate.service;

import com.mgmetehan.StoreAPIRestTemplate.model.Product;

import java.util.List;

/**
 * @author Metehan Gültekin
 * @Date 15.05.2022
 */
public interface ProductService {
    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product getProductById(Integer id);

    void deleteProductById(Integer id);

    Product updateProductById(Integer id, Product newProduct);
}
