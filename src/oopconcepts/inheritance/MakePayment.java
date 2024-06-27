package oopconcepts.inheritance;

import java.util.Scanner;

public class MakePayment {
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter Payment Method:");
        String payment = s.next();

        PaymentView p = new PaymentView();
        p.onPaymentMethodClick(payment);

    }
}
