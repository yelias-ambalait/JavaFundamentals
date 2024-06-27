package oopconcepts.abstraction;

public class OnlineWithdraw extends Withdraw{


    @Override
    void withdrawAmount() {
        System.out.println("Sorry!, this service is not available right now");
    }
}
