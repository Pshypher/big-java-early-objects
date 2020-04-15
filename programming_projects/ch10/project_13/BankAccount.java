package project_13;

import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;

/**
    A bank account has a balance that can be changed by 
    deposits and withdrawals.
*/
public class BankAccount implements Comparable, Formattable
{  
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

   public int compareTo(Object otherObject)
   {
      BankAccount other = (BankAccount) otherObject;
      if (balance < other.balance) { 
         return -1; }
      if (balance > other.balance) { 
         return 1; }
      return 0;
   }
   
   public void formatTo(Formatter formatter, int flags, int width, 
         int precision)
   {
      String output = balance + "";
      while (output.length() < width)
      {
         output = " " + output;
      }
      
      Appendable a = formatter.out();
      try
      {
         a.append(output);
      }
      catch (IOException e)
      {}
   }               
}
