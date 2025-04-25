package com.codewithbin.store;

import org.springframework.stereotype.Service;

@Service
public class paypal_payment_service implements payment_service {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("Amound="+amount);
    }
}
