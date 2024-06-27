package oopconcepts.paymentMethod;



import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter payment method:");
        String paymentType = s.next();
        PaymentView v = new PaymentView();
        v.onPaymentButtonClick(paymentType);

    }

}
