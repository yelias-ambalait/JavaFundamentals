package oopconcepts.abstraction;

import java.util.Scanner;

public class WithdrawBalance {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter withdraw method:");
        String withdrawType = s.next();
        WithdrawView wv = new WithdrawView();
        wv.onWithdrawButtonClick(withdrawType);

    }
}
