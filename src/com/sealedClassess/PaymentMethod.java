package com.sealedClassess;

public abstract sealed class PaymentMethod permits CreditCard, BankTransfer, OnlineTransfer {
    public abstract void processPayment(PaymentMethod payment);
}
