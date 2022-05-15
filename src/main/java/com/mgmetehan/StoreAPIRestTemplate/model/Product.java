package com.mgmetehan.StoreAPIRestTemplate.model;

import lombok.Data;

/**
 * @author Metehan Gültekin
 * @Date 15.05.2022
 */
@Data
public class Product {
    private Integer id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
}
