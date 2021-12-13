package com.example.casestudy.Dealer.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.casestudy.Dealer.model.Crop;
import com.example.casestudy.Dealer.model.Dealer;
import com.example.casestudy.Dealer.model.Farmer;
import com.example.casestudy.Dealer.repository.DealerRepository;


@RestController
@RequestMapping("/DEALER")
public class DealerResource {
	
	@Autowired
	private DealerRepository dealerreposoitory;
	
	@Autowired
  private RestTemplate restTemplate;
	
	@RequestMapping("/dealer")
	public String getDealer() {
		return "Hello Dealer";
	}
	@PostMapping("/adddealer")
	public String saveFarmer(@RequestBody Dealer dealer) {
		dealerreposoitory.save(dealer);
		return "Add dealer with id:" + dealer.getDealerid();
	}
	
	@GetMapping("/findAlldealer")
		public List<Dealer> getDealer1(){
		return dealerreposoitory.findAll();
	}
	
	@GetMapping("/{dealerid}")
	public Optional<Dealer> getFarmer(@PathVariable Integer dealerid){
		return dealerreposoitory.findById(dealerid);
	}
	
	@DeleteMapping("/{dealerid}") 
	public String delete(@PathVariable Integer dealerid) {
		dealerreposoitory.deleteById(dealerid);
	  return "book deleted with id : " + dealerid; 
	 }
	
	@PutMapping("/update/{id}")
	public String getDealer(@RequestBody Dealer dealer) {
		dealerreposoitory.save(dealer);
		return "dealer updated with id:" + dealer.getDealerid();
	}
	
	
	  
	  //-----------------------dealer can get farmer details------------------//
	  
	  @RequestMapping(value = "/farmerDetails/{farmername}") 
	  public Farmer[] farmerDetails(@PathVariable String farmername){ 
		  Farmer[] farmerDetails = restTemplate.getForObject("http://localhost:8081/FARMER/byName/"+farmername, Farmer[].class);
		  return farmerDetails;
	  }
	 
	  //-------------------------crop details---------------------------------//
	  
	  @RequestMapping("/findAllCrops")
	  public Crop[] getAllCrops() {
		Crop[] crop=restTemplate.getForObject("http://localhost:8083/CROP/findAllcrop", Crop[].class );
		return crop;
	  } 
	  
	 
	
	
	
	
}
