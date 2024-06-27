package oopconcepts.paymentMethod;

public class PayoneerPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Paypal payment method is processing");
    }
}
