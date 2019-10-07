import java.util.*;

public class BankAccount implements Comparable<BankAccount>, Measurable{
   private float balance = 0;
   private float rate;

   public BankAccount(float balance, float rate) {
      this.balance = balance;
      this.rate = rate;
   }

   public BankAccount(float rate) {
      this.rate = rate;
   }

   public static void main(String[] args) {

      BankAccount lessBalanceAccount = new BankAccount(3000, .1f);
      BankAccount zeroBalanceAccount = new BankAccount(.1f);
      BankAccount moreBalanceAccount = new BankAccount(3000, .3f);
      ArrayList<BankAccount> list = new ArrayList<BankAccount>();
      list.add(lessBalanceAccount);
      list.add(zeroBalanceAccount);
      list.add(moreBalanceAccount);
      Collections.sort(list);
      for (BankAccount ba : list) {
         System.out.println(ba.balance);
      }
      System.out.println(Data.average(list));
      // ArrayList<Measurable> listMeasurable = new ArrayList<Measurable>();
      // listMeasurable.add(lessBalanceAccount);
      // listMeasurable.add(zeroBalanceAccount);
      // listMeasurable.add(moreBalanceAccount);
      // System.out.println(Data.average(listMeasurable));
      // zeroBalanceAccount.processNYears(2);
      // System.out.println("balance after two years is: " +
      // zeroBalanceAccount.balance);

   }

   public void processYear() {
      float interest = this.balance * this.rate;
      this.balance = this.balance + interest;
   }

   public void processNYears(int n) {
      int i = 0;
      while (i < n) {
         this.processYear();
         i = i + 1;
      }
   }

   @Override
   public int compareTo(BankAccount ba) {
      if (this.balance > ba.balance)
         return 1;
      else if (this.balance < ba.balance)
         return -1;
      else
       return 0;
   }

  @Override
   public float getMeasure() {
      return balance;
   }
}

