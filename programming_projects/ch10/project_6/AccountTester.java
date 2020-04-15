package project_6;

/**
   This program demonstrates the use of a Measurer and a Filter.
*/
public class AccountTester
{
   public static void main(String[] args)
   {
      final int MIN_ALLOWED_BALANCE = 1000;
   
      BankAccount[] accounts = new BankAccount[] 
         {
             new BankAccount(1000),
             new BankAccount(0),
             new BankAccount(10000), 
             new BankAccount(999.999),
             new BankAccount(1000)
         };
   
      double average = Data.average(accounts, 
            (Object obj) -> 
                  ((BankAccount) obj).getBalance(), 
            (Object obj) -> 
                  ((BankAccount) obj).getBalance() >= MIN_ALLOWED_BALANCE);
      System.out.println("Average balance: " + average);
      System.out.println("Expected: 4000");
   }
}
