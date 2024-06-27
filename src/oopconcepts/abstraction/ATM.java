package oopconcepts.abstraction;

public class ATM extends Withdraw{
    @Override
    void withdrawAmount() {
        System.out.println("ATM withdraw process is running");
    }
}
