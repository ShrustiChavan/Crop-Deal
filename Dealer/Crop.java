package com.example.casestudy.Dealer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "CROP")
public class Crop {
	
	@Id
	private int cropid;
	private String cropname;
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
	public Crop(int cropid, String cropname) {
		super();
		this.cropid = cropid;
		this.cropname = cropname;
	}
	@Override
	public String toString() {
		return "Crop [cropid=" + cropid + ", cropname=" + cropname + "]";
	}
	
	

}
