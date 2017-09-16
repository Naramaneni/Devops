package com.example.productapp;

public class Product {

	String name;

	String price;

	String createdBy;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String price, String createdBy) {
		super();
		this.name = name;
		this.price = price;
		this.createdBy = createdBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
