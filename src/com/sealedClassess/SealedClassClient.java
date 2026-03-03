package com.sealedClassess;

public class SealedClassClient {

    public static void handelPayment(PaymentMethod payment) {
        switch (payment) {
            case CreditCard creditCard -> creditCard.processPayment(payment);
            case OnlineTransfer onlineTransfer -> onlineTransfer.processPayment(payment);
            case BankTransfer bankTransfer -> bankTransfer.processPayment(payment);
        }
    }

    public static void main(String[] args) {

        PaymentMethod paymentMethod = new CreditCard();
        handelPayment(paymentMethod);

        paymentMethod = new OnlineTransfer();
        handelPayment(paymentMethod);

        paymentMethod = new BankTransfer();
        handelPayment(paymentMethod);

    }
}
