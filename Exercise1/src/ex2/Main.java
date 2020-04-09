package ex2;

import ex1.SavingAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccountManager savingAccountManager = new SavingAccountManager(1,2,3,4);
        savingAccountManager.creat();
        NormalAccountManager normalAccountManager = new NormalAccountManager(1, 2,3,4);
        normalAccountManager.remove();
    }
}
