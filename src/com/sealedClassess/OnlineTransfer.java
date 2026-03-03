package com.sealedClassess;

public final class OnlineTransfer extends PaymentMethod {
    @Override
    public void processPayment(PaymentMethod payment) {
        System.out.println("Online Transfer Payment Method is Implemented");
    }
}
