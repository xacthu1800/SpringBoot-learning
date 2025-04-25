package com.codewithbin.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class order_service {
    private payment_service paymentService;

    public order_service(payment_service payment_service) {
        this.paymentService = payment_service;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
