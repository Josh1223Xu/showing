package com.joshua.service;

import java.util.List;

import com.joshua.model.Product;

public interface PojoService {
 
    void savePojo(Product pojo);
 
    List<Product> findAllProducts();
 
    void deleteProductByID(int id);
 
    Product findProductByID(int id);
 
    void updateProduct(Product pojo);
}