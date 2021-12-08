package com.example.casestudy.Crop.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Crop")
public class Crop {
	
	private int cropid;
	private String cropname;
	private double price;
	public int getCropid() {
		return cropid;
	}
	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Crop(int cropid, String cropname, double price) {
		super();
		this.cropid = cropid;
		this.cropname = cropname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Crop [cropid=" + cropid + ", cropname=" + cropname + ", price=" + price + "]";
	}

}
