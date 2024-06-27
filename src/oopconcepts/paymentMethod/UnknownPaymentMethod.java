package oopconcepts.paymentMethod;

public class UnknownPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("This payment method is not available right now");
    }
}
