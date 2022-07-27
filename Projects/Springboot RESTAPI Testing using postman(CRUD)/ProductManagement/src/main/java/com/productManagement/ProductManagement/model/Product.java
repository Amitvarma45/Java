package com.productManagement.ProductManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private float price;
 
    public Product() {
    }
 
    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
 
   
    public Integer getId() {
        return id;
    }
    //getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(Integer id) {
		this.id = id;
	}
 
    
    
}
