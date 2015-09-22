package com.joshua.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

@SuppressWarnings("serial")
@Entity
public class Product implements Serializable {
	@Id
	private int id;
	private String name;
	private String description;
    
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_product_id") 
	private Product parentProduct;
    
	@OneToMany(mappedBy = "parentProduct", fetch=FetchType.EAGER)
    private List<Product> childProduct = new ArrayList<Product>();
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Image> imageCollection= new ArrayList<Image>();
	
	
	public Product() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Product getParentProduct() {
		return parentProduct;
	}
	public void setParentProduct(Product parentProduct) {
		this.parentProduct = parentProduct;
	}
	@JsonIgnore
	public List<Product> getChildProduct() {
		return childProduct;
	}
	public void setChildProduct(List<Product> childProduct) {
		this.childProduct = childProduct;
	}
	@JsonIgnore
	public List<Image> getImageCollection() {
		return imageCollection;
	}
	public void setImageCollection(List<Image> imageCollection) {
		this.imageCollection = imageCollection;
	}
	
	

}
