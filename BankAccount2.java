import java.util.*;

public class BankAccount2 extends Measurable2 {
    private float balance = 0;
    private float rate;

    public BankAccount2(float balance, float rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public BankAccount2(float rate) {
        this.rate = rate;
    }

    public static void main(String[] args) {

        BankAccount2 lessBalanceAccount = new BankAccount2(2000, .1f);
        BankAccount2 zeroBalanceAccount = new BankAccount2(.1f);
        BankAccount2 moreBalanceAccount = new BankAccount2(1000, .3f);
        ArrayList<BankAccount2> list = new ArrayList<BankAccount2>();
        list.add(lessBalanceAccount);
        list.add(zeroBalanceAccount);
        list.add(moreBalanceAccount);
        Collections.sort(list);
        for (BankAccount2 ba : list) {
            System.out.println(ba.balance);
        }
        System.out.println(Measurable2.average(list));
    }

    @Override
    float getMeasure() {
        return this.balance;
    }
}
