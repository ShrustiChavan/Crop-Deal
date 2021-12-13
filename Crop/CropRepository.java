package com.example.casestudy.Crop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.casestudy.Crop.model.Crop;

@Repository
public interface CropRepository extends MongoRepository<Crop,Integer> {
	
	

}
