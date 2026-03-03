package com.sealedClassess;

public final class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod payment) {
        System.out.println("Bank Transfer Payment Method is Implemented");
    }
}
