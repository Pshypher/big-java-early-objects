package project_13;

/**
   This program demonstrates the BankAccount class
*/
public class BankAccountDemo
{
   public static void main(String[] args)
   {
      BankAccount momsSavings = new BankAccount(999.9999);
      momsSavings.deposit(39.59);
      
      System.out.printf("Balance:%10S\n", momsSavings);
   }
}
