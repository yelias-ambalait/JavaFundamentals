package oopconcepts.abstraction;

public class BankWithdraw extends Withdraw {
    @Override
    void withdrawAmount() {
        System.out.println("Bank withdraw is running");
    }
}
