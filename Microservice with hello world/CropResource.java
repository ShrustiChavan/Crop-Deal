package com.example.casestudy.Crop.resource;

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

import com.example.casestudy.Crop.model.Crop;
import com.example.casestudy.Crop.repository.CropRepository;


@RestController
public class CropResource {
	
	@Autowired
	private CropRepository croprepository;
	
	@RequestMapping("/crop")
	public String getcrop() {
		return "Hello crop";
	}
	
	@PostMapping("/addcrop")
	public String saveCrop(@RequestBody Crop crop) {
		croprepository.save(crop);
		return "Add crop with id:" + crop.getCropid();
	}
	
	@GetMapping("/findAlldealer")
		public List<Crop> getCrop(){
		return croprepository.findAll();
	}
	
	@GetMapping("/findAlldealer/{id}")
	public Optional<Crop> getCrop(@PathVariable int cropid){
		return croprepository.findById(cropid);
	}
	
	@DeleteMapping("/delete/{id}") 
	public String deleteCrop(@PathVariable int id) {
		croprepository.deleteById(id);
	  return "crop deleted with id : " + id; 
	  }

}
