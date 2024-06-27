package oopconcepts.inheritance;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type){

        switch(type.toLowerCase()){

            case "bkash":
                return new BkashPaymentMethod();

            case "nagad":
                return new NagadPaymentMethod();

            default:
                return new UnavailablePaymentMethod();
        }
    }
}
