package com.example.farmer.FarmerMC.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FARMER")
public class Farmer {
	
	    @Id
    	private int farmerid;
   		private String farmername;
		private long phoneno;
		private String farmeremail;
		//private location farmerLocation;
		private Map<String,croplist> crop= new HashMap();
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

		/*
		 * public location getFarmerLocation() { return farmerLocation; } public
		 * void setFarmerLocation(location farmerLocation) { //this.farmerLocation =
		 * farmerLocation; }
		 */
		public Map<String, croplist> getCrop() {
			return crop;
		}
		public void setCrop(Map<String, croplist> crop) {
			this.crop = crop;
		}
		public Farmer(int farmerid, String farmername, long phoneno, String farmeremail, 
				Map<String, croplist> crop) {
			super();
			this.farmerid = farmerid;
			this.farmername = farmername;
			this.phoneno = phoneno;
			this.farmeremail = farmeremail;
			//this.farmerLocation = farmerLocation;
			this.crop = crop;
		}
		@Override
		public String toString() {
			return "Farmer [farmerid=" + farmerid + ", farmername=" + farmername + ", phoneno=" + phoneno
					+ ", farmeremail=" + farmeremail + ",  crop=" + crop + "]";
		}
		
		public Farmer() {
			
		}

	}



