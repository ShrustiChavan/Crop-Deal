package com.example.farmer.FarmerMC.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		return "Add farmer with id:" + farmer.getFarmerid();
	}
	
	@GetMapping("/findAllfarmer")
		public List<Farmer> getFarmer(){
		return farmerrepositry.findAll();
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<Farmer> getBook(@PathVariable int id) {
		return farmerrepositry.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		farmerrepositry.deleteById(id);
		return "book deleted with id : " + id;
	}
	
		/*
		 * public Optional<Farmer> updateBookById(int id, BookUpdatePayload
		 * bookUpdatePayload) { Optional<Farmer> book = farmerrepositry.findById(id);
		 * book.ifPresent(b -> b.setTitle(bookUpdatePayload.getTitle()));
		 * book.ifPresent(b -> b.setAuthor(bookUpdatePayload.getAuthor()));
		 * book.ifPresent(b -> farmerrepositry.save(b)); return book;
		 */
}


