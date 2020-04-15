import java.util.Scanner;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private int accountNumber;
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      if (amount > balance)
      {
         throw new InsufficientFundsException(
            "withdrawal of " + amount + " exceeds balance of " + balance);
      }
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   
   public String toString()
   {
      String output = "[accountNumber=%03d, balance=%.2f]";
      return getClass().getName() + 
         String.format(output, accountNumber, balance);
   }
   
   /**
      Reads and assigns values to the accountNumber and balance of
      this BankAccount.
      @param in the input stream
   */
   public void read(Scanner in) throws BadDataException
   {
      if (!in.hasNextInt())
      {
         throw new BadDataException(
            "account number expected got " + in.next());
      }
      accountNumber = in.nextInt();
      
      if (!in.hasNextDouble())
      {
         throw new BadDataException(
            "account balance expected got " + in.next());
      }
      balance = in.nextDouble();
   }
}
