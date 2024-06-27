package oopconcepts.inheritance;

public class UnavailablePaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("This Payment Method is not available right now");
    }
}
