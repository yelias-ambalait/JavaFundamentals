package oopconcepts.paymentMethod;

public class WisePaymentMethod extends PaymentMethod {
    @Override
    void makePayment() {
        System.out.println("Wise Payment Method is processing");
    }
}
