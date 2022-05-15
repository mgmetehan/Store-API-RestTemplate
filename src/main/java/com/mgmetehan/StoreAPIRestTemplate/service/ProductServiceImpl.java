package com.mgmetehan.StoreAPIRestTemplate.service;

import com.mgmetehan.StoreAPIRestTemplate.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
}
