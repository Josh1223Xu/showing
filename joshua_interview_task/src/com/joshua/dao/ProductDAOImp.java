package com.joshua.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joshua.model.Product;

@Repository
public class ProductDAOImp extends AbstractDAO implements ProductDAO {
	

	@Override
	public void persistProduct(Object pojo) {
		persist(pojo);
	}
    
	@Override
	public List<Product> findAllProducts() {
		Criteria criteria = getSession().createCriteria(Product.class);
        return (List<Product>)criteria.list();
	}

	@Override
	public void deleteProductByID(int id) {
		Query query = getSession().createSQLQuery("delete from Employee where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
	}

    @Override
	public Product findProductByID(int id) {
		Criteria criteria = getSession().createCriteria(Product.class);
        criteria.add(Restrictions.eq("id",id));
        return (Product) criteria.uniqueResult();
	}

	@Override
	public void updateProduct(Object pojo) {
		getSession().update(pojo);
		
	}

}
