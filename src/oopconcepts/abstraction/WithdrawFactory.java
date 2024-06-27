package oopconcepts.abstraction;

public class WithdrawFactory {

    public static Withdraw getWithdraw(String type){

        switch(type.toLowerCase()){

            case "bank":
                return new BankWithdraw();

            case "atm":
                return new ATM();

            default:
                return new OnlineWithdraw();
        }
    }
}
