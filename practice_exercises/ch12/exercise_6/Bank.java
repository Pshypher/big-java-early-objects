import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   A bank contains customers.
*/
public class Bank
{  
   private ArrayList<Customer> customers;
   private ArrayList<BankAccount> accounts;

   /**
      Constructs a bank with no customers.
   */
   public Bank()
   {  
      customers = new ArrayList<Customer>();
      accounts = new ArrayList<BankAccount>();
   }
   
   /**
      Reads the customer numbers and pins.
      @param filename the name of the customer file
   */
   public void readCustomers(String filename) 
         throws IOException
   {  
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext())
      {  
         int number = in.nextInt();
         int pin = in.nextInt();
         Customer c = new Customer(number, pin);
         addCustomer(c);
      }
      in.close();
   }
   
   /**
      Adds a customer to the bank.
      @param c the customer to add
   */
   public void addCustomer(Customer c)
   {  
      BankAccount savingsAccount = new SavingsAccount();
      BankAccount checkingAccount = new CheckingAccount();
      savingsAccount.addCustomer(c);
      checkingAccount.addCustomer(c);
      customers.add(c);
      accounts.add(savingsAccount);
      accounts.add(checkingAccount);
   }
   
   /** 
      Finds a customer in the bank.
      @param aNumber a customer number
      @param aPin a personal identification number
      @return the matching customer, or null if no customer 
      matches
   */
   public Customer findCustomer(int aNumber, int aPin)
   {  
      for (Customer c : customers)
      {  
         if (c.match(aNumber, aPin))
         {
            return c;
         }
      }
      return null;
   }
   
   /**
      Gets the bank account for a given customer and of the 
      specified type.
      @param c the joint owner of the account
      @param type one of CHECKING or SAVINGS
   */
   public BankAccount getAccount(Customer c, int type)
   {
      BankAccount account = null;
      
      boolean found = false;
      int i = 0;
      while (!found && i < accounts.size())
      {
         BankAccount a = accounts.get(i);
         if (a.isJointAccountHolder(c))
         {
            if (type == ATM.CHECKING && a instanceof CheckingAccount
               || type == ATM.SAVINGS && a instanceof SavingsAccount)
            {
               account = a;
               found = true;
            }
         }
         i++;
      }
      
      return account;
   }
}


