package oopconcepts.abstraction;

public class WithdrawView {

    public void onWithdrawButtonClick(String withdrawType){
        Withdraw withdraw = WithdrawFactory.getWithdraw(withdrawType);
        withdraw.withdrawAmount();
    }
}
