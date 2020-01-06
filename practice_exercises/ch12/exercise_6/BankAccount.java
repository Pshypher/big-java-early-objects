import java.util.ArrayList;

/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount
{
   private double balance;
   private ArrayList<Customer> customers;
   
   /**
      Constructs a bank account with an account number and a 
      given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {  
      balance = initialBalance;
      customers = new ArrayList<Customer>();
   }

   /**
      Constructs a bank account with an account number and 
      a zero balance.
   */
   public BankAccount()
   {  
      this(0);
   }
 
   /** 
      Deposits money into the account.
      @param amount the amount of money to deposit
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /** 
      Withdraws money from the account.
      @param amount the amount of money to withdraw
   */
   public void withdraw(double amount) 
   {  
      balance = balance - amount;
   }

   /** 
      Gets the account balance.
      @return the account balance
   */
   public double getBalance()
   {  
      return balance; 
   }
   
   /**
      Adds a customer to this account
      @param c the customer
   */
   public void addCustomer(Customer c)
   {
      customers.add(c);
   }
   
   /**
      Checks whether a given customer can make transactions 
      on this account.
      @param c the customer
   */
   public boolean isJointAccountHolder(Customer c)
   {
      boolean found = false;
      for (int i = 0; i < customers.size() && !found; i++)
      {
         if (customers.get(i).equals(c))
         {
            found = true;
         }
      }
      
      return found;   
   }
}

