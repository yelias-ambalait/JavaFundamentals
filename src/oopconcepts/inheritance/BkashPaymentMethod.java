package oopconcepts.inheritance;

public class BkashPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("bKash Payment Method is processing");
    }
}
