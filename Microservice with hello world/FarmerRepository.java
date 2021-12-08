package com.example.farmer.FarmerMC.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.farmer.FarmerMC.model.Farmer;

public interface FarmerRepository extends MongoRepository<Farmer,Integer>{

}
