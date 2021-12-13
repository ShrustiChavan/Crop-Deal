package com.example.demo.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.order.common.Payment;
import com.example.demo.order.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Payment,Integer>{

	void save(Order order);

	

}


