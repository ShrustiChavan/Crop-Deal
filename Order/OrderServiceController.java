package com.example.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.order.common.TxResponse;
import com.example.demo.order.entity.Order;
import com.example.demo.order.service.OrderService;



@RestController
@RequestMapping(value = "/order")
public class OrderServiceController {
	@Autowired
    private OrderService service;

    @PostMapping(value = "/placeOrder" )
    public String placeOrder(@RequestBody Order order){
    	service.placeOrder(order);
    	return "order is placed:" + order.getId();
    	//return service.placeOrder(order);
    }

}



//return service.placeOrder(order);