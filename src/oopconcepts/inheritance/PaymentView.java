package oopconcepts.inheritance;

public class PaymentView {

    public void onPaymentMethodClick(String payment){
        PaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod(payment);
        paymentMethod.makePayment();
    }
}
