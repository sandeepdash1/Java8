package com.sealedClassess;

public final class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod payment) {
        System.out.println("Credit Card Payment Method is Implemented");
    }
}
