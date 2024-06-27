package oopconcepts.paymentMethod;

public class MoneygramPaymentMethod extends PaymentMethod{
    @Override
    void makePayment() {
        System.out.println("Moneygram Payment Method is processing");
    }
}
