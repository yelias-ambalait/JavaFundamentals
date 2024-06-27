package oopconcepts.inheritance;

public class NagadPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Nagad Payment Method is processing");
    }
}
