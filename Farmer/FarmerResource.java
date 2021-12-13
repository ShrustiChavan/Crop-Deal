package com.example.farmer.FarmerMC.resource;

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

import com.example.farmer.FarmerMC.model.Farmer;
import com.example.farmer.FarmerMC.repositry.FarmerRepository;


@RestController
@RequestMapping("/FARMER")
public class FarmerResource {
	
	@Autowired
	private FarmerRepository farmerrepositry;
	
	@RequestMapping("/farmer")
	public String getfarmer() {
		return "Hello Farmer";
	}
    
	@PostMapping("/addfarmer")
	public String saveFarmer(@RequestBody Farmer farmer) {
		farmerrepositry.save(farmer);
		return "Add farmer with id:" ;
	}
	
	@GetMapping("/findAllfarmer")
		public List<Farmer> getFarmer(){
		return farmerrepositry.findAll();
	}
	
	@GetMapping("/{farmerid}")
	public Optional<Farmer> getFarmer(@PathVariable Integer farmerid){
		return farmerrepositry.findById(farmerid);
	}
	@GetMapping(value = "/byName/{farmername}", produces="application/json")
	public List<Farmer> getFarmer(@PathVariable String farmername){
	return farmerrepositry.findByFarmername(farmername);
	}
	
	@DeleteMapping("/delete/{farmerid}") 
	public String delete(@PathVariable Integer farmerid) {
	  farmerrepositry.deleteById(farmerid);
	  return "book deleted with id : " + farmerid; 
	 }
	
	@PutMapping("/update/{id}")
	public String getfarmer(@RequestBody Farmer farmer) {
		farmerrepositry.save(farmer);
		return "dealer updated with id:" + farmer.getFarmerid();
	}
	
	
	
}


