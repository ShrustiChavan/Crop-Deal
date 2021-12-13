package com.example.demo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.order.common.Payment;
import com.example.demo.order.common.TxResponse;
import com.example.demo.order.entity.Order;
import com.example.demo.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
    private OrderRepository repository;

    @Autowired
    private RestTemplate template;

    public TxResponse placeOrder(Order order){
        repository.save(order);
        Payment paymentReq = new Payment();
        paymentReq.setOrderId(order.getId());
        paymentReq.setAmount(order.getQuantity()*order.getPrice());
        Payment paymentRes = template.postForObject("http://localhost:8086/payment/doPay",paymentReq, Payment.class);
        TxResponse txResponse = new TxResponse();
        txResponse.setOrder(order);
        txResponse.setStatus(paymentRes.getPaymentStatus());
        txResponse.setAmount(paymentRes.getAmount());
        txResponse.setTxId(paymentRes.getTxId());
        return txResponse;
    }

}
