package oopconcepts.paymentMethod;

public class TaptapPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Taptap Payment Method is processing");
    }
}
