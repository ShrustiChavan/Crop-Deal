package com.example.farmer.FarmerMC.model;

public class croplist {
	
	private String name;
	private double price;
	private double quantity;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public croplist(String name, double price, double quantity, String type) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "croplist [name=" + name + ", price=" + price + ", quantity=" + quantity + ", type=" + type + "]";
	}

}
