package com.joshua.operation;

import java.util.List;

import org.hibernate.Query;

import com.joshua.dao.AbstractDAO;
import com.joshua.model.Product;

public class OperationD extends AbstractDAO {
	public List<Product> getSpecificProduct(int id) {

		Query query = getSession().createQuery("from Product where id = :id");
		query.setInteger("id", id);

		List<Product> productList = (List<Product>) query.list();

		return productList;
	}

}
