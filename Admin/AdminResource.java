package com.example.casestudy.Admin.resource;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.casestudy.Admin.model.Crop;
import com.example.casestudy.Admin.model.Dealer;
import com.example.casestudy.Admin.model.Farmer;

@RestController
@RequestMapping("/ADMIN")
public class AdminResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/admin")
	public String getDealer() {
		return "Hello Admin";
	}
	
	
	  //-------------Operations ADMIN can do using Farmer----------------//
	  
	  
	  //------------------------1. Get all the details of farmer-------------------------------//
	  
	  @GetMapping("/getAllFarmers")
	  public List<Farmer> getAllFarmers() {
		  return Arrays.asList(restTemplate.getForObject("http://localhost:8081/FARMER/findAllfarmer", Farmer[].class)); 
		  }
	  
	  //------------------------2. Get farmer details using farmerid-------------------------//
	  
	  @RequestMapping("/farmerdetails/{userId}") 
	  public Farmer getfarmerdetails(@PathVariable int userId){ Farmer farmer=restTemplate.getForObject("http://localhost:8081/FARMER/"+ userId,Farmer.class); 
	  return farmer;
	  }
	  
	  //------------------------3. Update farmer using farmerid------------------------------//
	  
	  @PostMapping("/updateFarmer/{farmerId}") 
	  public String UpdateFarmer(@PathVariable String farmerId, @RequestBody Farmer Farmer) {
	  return restTemplate.postForObject("http://localhost:8081/FARMER/update/" +farmerId, Farmer,String.class); 
	  }
	  
	  //------------------------4. Delete farmer details using userid-------------------------//
	  
	  @DeleteMapping("/deletefarmer/{userId}") 
	  public Boolean deleteFarmerById(@PathVariable int farmerId) {
	  restTemplate.delete("http://localhost:8081/FARMER/delete/" + farmerId);
	  return true; }
	  
	  
	  // Operations ADMIN can do using DEALER //
	  
	  @RequestMapping(value = "/findAllDealer",method = RequestMethod.GET)
	  public Dealer[] getAllDealer() { 
		  Dealer[] dealer=restTemplate.getForObject("http://localhost:8082/DEALER/findAlldealer",Dealer[].class ); 
	  return dealer; 
	  }
	 
	  
	  
	  //----------------------------------1. Get details with dealerid---------------------------------//
	  
	  @RequestMapping("/dealerdetails/{userId}")
	  public Dealer getdealerdetails(@PathVariable int userId){
	  Dealer dealer= restTemplate.getForObject("http://localhost:8082/DEALER/"+ userId, Dealer.class); 
	  return dealer; 
	  }
	  
	  //----------------------------------2. get all dealers details-------------------------------//
	  
	  @PostMapping("/addDealer") 
	  public String addDealer( @RequestBody Dealer dealer) { 
	  String msg = restTemplate.postForObject("http://localhost:8082/DEALER/",dealer,String.class); 
	  return msg; 
	  }
	  
	  //----------------------------------3. Update dealer details--------------------------------//
	  
	  @PostMapping("/updateDealer/{dealerId}") 
	  public String UpdateDealer(@PathVariable String dealerId, @RequestBody Dealer Dealer) {
	  return restTemplate.postForObject("http://localhost:8082/DEALER/update/" +dealerId, Dealer,String.class); }
	  
	  //----------------------------------4. Delete dealer details---------------------------------//
	  
	  @RequestMapping("/deletedealer/{userId}") 
	  public Boolean deleteDealerById(@PathVariable int dealerId) {
	  restTemplate.delete("http://localhost:8082/DEALER/" + dealerId);
	  return true;
	  }
	  
	  
	                   //----------operations ADMIN can do with Crop--------------//
	  
	  
	  //----------------------------------1.get crop details through id-----------------------//
	  
	  @RequestMapping("/cropdetails/{userId}") 
	  public Crop getCropdetails(@PathVariable int userId){ 
		  Crop crop= restTemplate.getForObject("http://localhost:8083/CROP/"+ userId, Crop.class);
	  return crop; }
	  
	  //--------------------------------2.finding all crops-----------------------------------//
	  
	  @RequestMapping(value = "/findAllCrops",method = RequestMethod.GET)
	  public Crop[] getAllCrops() { 
	  Crop[] crop=restTemplate.getForObject("http://localhost:8083/CROP/findAllcrop",Crop[].class ); 
	  return crop; }
	  
	  //-------------------------------3.delete crop--------------------------------------//
	  
	  @RequestMapping("/deleteCrop/{cropId}")
	  public Boolean deleteCropById(@PathVariable String cropid) {
	  restTemplate.delete("http://localhost:8083/CROP/delete/" + cropid); return
	  true; }
	  
	  
	  
	  
	  
	  }
	  
	 


/*
 * @RequestMapping("/delete/{farmerid}") public String getdelete(@PathVariable
 * int farmerid){ System.out.println("hiiii"); String farmer=
 * restTemplate.getForObject("http://localhost:8081/FARMER/delete/"+ farmerid,
 * String.class); System.out.println("hiiii"); return "deleted"; }
 */


//restTemplate.getForObject("http://rating-data-service-trial/ratingsdata/users/"+userId, UserRating.class);
