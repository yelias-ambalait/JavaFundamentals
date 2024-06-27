package oopconcepts.paymentMethod;

public class RiaPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Ria Payment Method is processing");
    }
}
