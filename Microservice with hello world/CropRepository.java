package com.example.casestudy.Crop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.casestudy.Crop.model.Crop;

public interface CropRepository extends MongoRepository<Crop,Integer> {
	
	

}
