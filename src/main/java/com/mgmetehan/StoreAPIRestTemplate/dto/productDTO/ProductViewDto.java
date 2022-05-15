package com.mgmetehan.StoreAPIRestTemplate.dto.productDTO;

import com.mgmetehan.StoreAPIRestTemplate.model.Product;
import lombok.Data;

/**
  *@author Metehan Gültekin 
  *@Date 15.05.2022
  */
@Data
public class ProductViewDto {
    private Integer id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

    public ProductViewDto(Integer id, String title, Double price, String description, String category, String image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
    }

    public static ProductViewDto of(Product product) {
        return new ProductViewDto(product.getId(), product.getTitle(), product.getPrice(), product.getDescription(),
                product.getCategory(), product.getImage());
    }
}
