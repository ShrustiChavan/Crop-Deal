package com.example.casestudy.Dealer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.casestudy.Dealer.model.Dealer;

@Repository
public interface DealerRepository extends MongoRepository<Dealer,Integer>{

}
