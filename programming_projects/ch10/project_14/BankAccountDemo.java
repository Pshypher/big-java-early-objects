package project_14;

/**
   This program demonstrates the BankAccount class
*/
public class BankAccountDemo
{
   public static void main(String[] args)
   {
      BankAccount momsSavings = new BankAccount(999.9999);
      momsSavings.deposit(39.59);
      System.out.printf("Balance:%10.2S", momsSavings);
   }
}
