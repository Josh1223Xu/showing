package com.joshua.dao;

import java.util.List;

import com.joshua.model.Product;



public interface ProductDAO {
	
	void persistProduct(Object pojo);
    
    List<Product> findAllProducts();
     
    void deleteProductByID(int id);
     
    Product findProductByID(int id);
     
    void updateProduct(Object pojo);
}
