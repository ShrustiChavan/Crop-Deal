package com.example.casestudy.Dealer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FARMER")
public class Farmer {
	
	    @Id
    	private int farmerid;
   		private String farmername;
		private long phoneno;
		private String farmeremail;
		
		public int getFarmerid() {
			return farmerid;
		}

		public void setFarmerid(int farmerid) {
			this.farmerid = farmerid;
		}
		public String getFarmername() {
			return farmername;
		}
		public void setFarmername(String farmername) {
			this.farmername = farmername;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}
		public String getFarmeremail() {
			return farmeremail;
		}
		public void setFarmeremail(String farmeremail) {
			this.farmeremail = farmeremail;
		}
		public Farmer(int farmerid, String farmername, long phoneno, String farmeremail) {
			super();
			this.farmerid = farmerid;
			this.farmername = farmername;
			this.phoneno = phoneno;
			this.farmeremail = farmeremail;
		}

		@Override
		public String toString() {
			return "Farmer [farmerid=" + farmerid + ", farmername=" + farmername + ", phoneno=" + phoneno
					+ ", farmeremail=" + farmeremail + "]";
		}

		public Farmer() {
			 
		 }
		

	}



