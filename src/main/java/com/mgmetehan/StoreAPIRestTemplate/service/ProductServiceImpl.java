package com.mgmetehan.StoreAPIRestTemplate.service;

import com.mgmetehan.StoreAPIRestTemplate.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Metehan Gültekin
 * @Date 15.05.2022
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "https://fakestoreapi.com/products";

    @Override
    public List<Product> getAllProducts() {
        ResponseEntity<List> result = restTemplate.getForEntity(url, List.class);
        return result.getBody();
    }

    @Override
    public Product createProduct(Product product) {
        ResponseEntity<Product> result = restTemplate.postForEntity(url, product, Product.class);
        return result.getBody();
    }

    @Override
    public Product getProductById(Integer id) {
        ResponseEntity<Product> result = restTemplate.getForEntity(url + "/" + id, Product.class);
        return result.getBody();
    }

    @Override
    public void deleteProductById(Integer id) {
        restTemplate.delete(url + "/" + id);
    }

    @Override
    public Product updateProductById(Integer id, Product newProduct) {
        restTemplate.put(url + "/" + id, newProduct, Product.class);
        return getProductById(id);//iyi bir cozum degil
    }

}
