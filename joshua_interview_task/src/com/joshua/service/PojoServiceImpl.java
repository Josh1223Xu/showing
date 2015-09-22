package com.joshua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joshua.dao.ProductDAO;
import com.joshua.model.Product;
 
 
@Service("pojoService")
@Transactional
public class PojoServiceImpl implements PojoService{
 
    @Autowired
    private ProductDAO productDAO;



	@Override
	public void savePojo(Product pojo) {
		productDAO.persistProduct(pojo);
		
	}

	@Override
	public List<Product> findAllProducts() {
		return productDAO.findAllProducts();
	}

	@Override
	public void deleteProductByID(int id) {
		productDAO.deleteProductByID(id);
		
	}

	@Override
	public Product findProductByID(int id) {
		return productDAO.findProductByID(id);
		
	}

	@Override
	public void updateProduct(Product pojo) {
		productDAO.updateProduct(pojo);
		
	}

}