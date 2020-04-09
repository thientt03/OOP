package ex2;

import java.util.Scanner;

public class NormalAccountManager extends AccountManager{
    public static Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    public NormalAccountManager(int interest_rate, int term, int deposit, int withdraw) {
        super(interest_rate, term, deposit, withdraw);
    }

    @Override
    public void remove() {
        int sum = 0;
        int count = 0;
        sum = deposit + term * withdraw * interest_rate;
        count = sum - n;
        System.out.println("Đã chuyển khoảng thành công: " + n);
        System.out.println("Số tiền còn trong tài khoản là: " + count);
    }
}
