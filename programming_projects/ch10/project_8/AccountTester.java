package project_8;


/**
   This program demonstrates the use of a Measurer and a Filter.
*/
public class AccountTester
{
   public static void main(String[] args)
   {
      Measurer meas = new AccountMeasurer();
      Filter condition = new AccountFilter();
   
      BankAccount[] accounts = new BankAccount[] 
         {
             new BankAccount(1000),
             new BankAccount(0),
             new BankAccount(10000), 
             new BankAccount(999.99999999),
             new BankAccount(1000)
         };

      double average = Data.average(accounts, meas, condition);
      System.out.println("Average balance: " + average);
      System.out.println("Expected: 4000");
   }
}
