package com.joshua.operation;

import java.util.List;

import org.hibernate.Query;
import com.joshua.dao.AbstractDAO;
import com.joshua.model.Image;
import com.joshua.model.Product;

public class OperationF extends AbstractDAO {
	
	public List<Image> getSpecificProduct(int id){
	
	    Query query = getSession().createQuery("from Product where id =:id");
	    query.setInteger("id", id);
	    
	    List<Product> productList = (List<Product>)query.list();
		Product product = productList.get(0);
		List<Image> image = product.getImageCollection();
	 
		return image;
	}
	

}
