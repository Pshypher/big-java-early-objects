/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
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
      if (initialBalance < 0)
      {
         throw new NegativeInitialBalanceException("Initial negative balance");
      }
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      if (amount < 0)
      {
         throw new NegativeDepositAmountException("Amount of deposit less than 0");
      }
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
         throw new IllegalWithdrawalAmountException("Amount exceeds balance");
      }
      if (amount < 0)
      {
         throw new IllegalWithdrawalAmountException("Negative withdrawal amount");
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
}
