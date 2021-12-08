package com.example.casestudy.Dealer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.casestudy.Dealer.model.Dealer;

public interface DealerRepository extends MongoRepository<Dealer,Integer>{

}
