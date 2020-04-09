package ex2;

public class SavingAccountManager extends AccountManager {

    public SavingAccountManager(int interest_rate, int term, int deposit, int withdraw) {
        super(interest_rate, term, deposit, withdraw);
    }

    @Override
    public void creat() {
        int sum = 0;
        sum = deposit + term * withdraw * interest_rate;
        System.out.println(sum);
    }

}
