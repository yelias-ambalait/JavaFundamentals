package oopconcepts.paymentMethod;

public class PayPalPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Paypal payment method is processing");
    }
}
