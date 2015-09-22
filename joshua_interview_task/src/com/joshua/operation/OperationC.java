package com.joshua.operation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.joshua.dao.AbstractDAO;
import com.joshua.model.Product;

public class OperationC extends AbstractDAO {

	public List<Product> getSpecificProduct(String name) {

		Query query = getSession().createQuery(
				"select p.parentProduct from Product p where p.name =:name");
		query.setString("name", name);

		List<Product> productList = (List<Product>) query.list();

		return productList;
	}

}
