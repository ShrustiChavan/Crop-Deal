package com.example.demo.order.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ORDER")
@Entity
public class Order {
	    @Id
	    private int id;
	    private String name;
	    private int quantity;
	    private double price;

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

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }



}
