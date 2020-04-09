package ex1;

public class SavingAccount extends BankingAccount {
    int interest_rate;
    int term;

    public SavingAccount(int deposit, int withdraw, int interest_rate, int term) {
        super(deposit, withdraw);
        this.interest_rate = interest_rate;
        this.term = term;
    }

    public int getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(int interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
