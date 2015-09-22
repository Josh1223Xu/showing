package com.joshua.operation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.joshua.dao.AbstractDAO;
import com.joshua.model.Product;

public class OperationB extends AbstractDAO{
		
	public List<Product> getAllProducts(){
		
	    Query query = getSession().createQuery("from Product");
	    
	    List<Product> productList = (List<Product>)query.list();

		return productList;
	}
	


}
