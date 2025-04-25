package com.codewithbin.store;

public class stripe_payment_service implements payment_service {
    @Override
    public void processPayment(double amount) {
        System.out.println("stripe");
        System.out.println("Amound="+amount);
    }
}
