package com.example.farmer.FarmerMC.repositry;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.farmer.FarmerMC.model.Farmer;

@Repository
public interface FarmerRepository extends MongoRepository<Farmer,Integer>{
	
	List<Farmer> findByFarmername(String name);

}