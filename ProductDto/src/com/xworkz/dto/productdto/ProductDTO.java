package com.xworkz.dto.productdto;

import java.io.Serializable;

public class ProductDTO implements Serializable, Comparable<ProductDTO>{

	
	String productName;
	int id;
	double cost;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(int id, String productName, double cost) {
		super();
		this.productName = productName;
		this.id = id;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + productName + ", id=" + id + ", cost=" + cost + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int compareTo(ProductDTO o) {
		
		return Double.compare(this.cost, o.cost);
	}
	
}
