package com.example.casestudy.Crop.resource;

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

import com.example.casestudy.Crop.model.Crop;
import com.example.casestudy.Crop.repository.CropRepository;

@RestController
@RequestMapping("/CROP")
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
	
	@GetMapping("/findAllcrop")
		public List<Crop> getCrop(){
		return croprepository.findAll();
	}
	
	@GetMapping("/{cropid}")
	public Optional<Crop> getFarmer(@PathVariable Integer cropid){
		return croprepository.findById(cropid);
	}
	
	@DeleteMapping("/delete/{cropid}") 
	public String delete(@PathVariable Integer cropid) {
		croprepository.deleteById(cropid);
	  return "crop deleted with id : " + cropid; 
	 }

	@PutMapping("/update/{id}")
	public String getCrop(@RequestBody Crop crop) {
		croprepository.save(crop);
		return "crop updated with id:" + crop.getCropid();
	}
}
