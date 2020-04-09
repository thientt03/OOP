package ex1;

public class BankingAccount {
    //Todo : First, we use this class as a super class
    // for define another class in Banking
    // Remember ! We have 2 type's BankingAccount
    //  1 : SavingAccount: properties
    //      ( deposit, withdraw , interest rate, term )
    //  2 : NormalAccount: properties
    //      (deposit, withdraw )
    // YOU : Now you have to define super class & sub class needed
    // with description above.
    int deposit;
    int withdraw;

    public BankingAccount(int deposit, int withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
}
