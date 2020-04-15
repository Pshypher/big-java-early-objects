package project_10;

/**
   This program demonstrates the use of a Measurer and a Filter.
*/
public class AccountTester
{
   public static void main(String[] args)
   {
      Measurer meas = new AccountMeasurer();
      Filter condition = new AccountFilter().invert();
   
      BankAccount[] accounts = new BankAccount[] 
         {
             new BankAccount(1000),
             new BankAccount(0),
             new BankAccount(500), 
             new BankAccount(999.999),
             new BankAccount(750)
         };
   
      double average = Data.average(accounts, meas, condition);
      System.out.printf("Average balance: %.2f\n", average);
      System.out.println("Expected: 562.49");
   }
}
