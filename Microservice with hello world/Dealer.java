package com.example.casestudy.Dealer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Dealer")
public class Dealer {
	
	private int dealerid;
	private String dealername;
	private long dealerph;
	private String dealeremail;
	public int getDealerid() {
		return dealerid;
	}
	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	public long getDealerph() {
		return dealerph;
	}
	public void setDealerph(long dealerph) {
		this.dealerph = dealerph;
	}
	public String getDealeremail() {
		return dealeremail;
	}
	public void setDealeremail(String dealeremail) {
		this.dealeremail = dealeremail;
	}
	public Dealer(int dealerid, String dealername, long dealerph, String dealeremail) {
		super();
		this.dealerid = dealerid;
		this.dealername = dealername;
		this.dealerph = dealerph;
		this.dealeremail = dealeremail;
	}
	@Override
	public String toString() {
		return "Dealer [dealerid=" + dealerid + ", dealername=" + dealername + ", dealerph=" + dealerph
				+ ", dealeremail=" + dealeremail + "]";
	}
		

}
