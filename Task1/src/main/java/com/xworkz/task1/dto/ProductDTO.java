package com.xworkz.task1.dto;

public class ProductDTO {

	String companyName;
	String productName;
	String productType;
	int quantity;
	int cost;
	
	public ProductDTO(String companyName, String productName, String productType, int quantity, int cost) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.productType = productType;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
