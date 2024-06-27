package oopconcepts.paymentMethod;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type){
        switch(type.toLowerCase()){

            case "remitly":
                return new RemitlyPaymentMethod();

            case "wise":
                return new WisePaymentMethod();

            case "paypal":
                return new PayPalPaymentMethod();

            case "payoneer":
                return new PayoneerPaymentMethod();

            case "taptap":
                return new TaptapPaymentMethod();

            case "moneygram":
                return new MoneygramPaymentMethod();

            case "ria":
                return new RiaPaymentMethod();

            default:
                return new UnknownPaymentMethod();
        }
    }
}
