package ex2;

public abstract class AccountManager{
    //Todo we use AccountManager as a super class for other //Lớp cha cho người dùng
    // As BankingAccount.class, we have 2 options for consumers.// Như BankingAccount.class chúng tôi có 2 lựa chọn cho người dùng
    // We use this super class as abstract class for SavingAccountManager, NormalAccountManager// chúng tôi tạo ra 2 lớp trừu tượng là SavingAccountManager, NormalAccountManager
    // We look the properties's BankingAccount to define the abstract & non abstract method needed for manage BankingAccount. // Chúng tôi xem xét BankAccount của các thuộc tính để xác định phương thức trừu tượng & không trừu tượng cần thiết để quản lý BankingAccount.
    // Requirement
    // - SavingAccountManager, we need calculate total the amount of interest and principal that users will receive in Withdraw // tính tổng tiền lãi và tiền gốc mà người dùng nhận khi rút tiền
    // - NormalAccountManager, we can transfer money between the Account.// chuyển tiền giữa các tài khoản
    // Remember !! AccountManager.class, we can // chúng ta cần tạo method creat và remove.
    // - create,
    // - remove
    int interest_rate;
    int term;
    int deposit;
    int withdraw;

    public AccountManager(int interest_rate, int term, int deposit, int withdraw) {
        this.interest_rate = interest_rate;
        this.term = term;
        this.deposit = deposit;
        this.withdraw = withdraw;
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

    public void creat(){

    }
    public void remove(){

    }
}
