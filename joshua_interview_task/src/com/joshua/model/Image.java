package com.joshua.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.codehaus.jackson.annotate.JsonBackReference;

@SuppressWarnings("serial")
@Entity
public class Image implements Serializable {
	@Id 
	@GeneratedValue
	private int id;
	private String type;
	private String location;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	public Image() {
		
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
