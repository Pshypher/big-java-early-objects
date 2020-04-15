import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   A bank class contains several bank accounts
*/
public class Bank
{
   private ArrayList<BankAccount> accounts;
   
   /**
      Constructs a Bank with an empty list of accounts.
   */
   public Bank()
   {
      accounts = new ArrayList<BankAccount>();
   }
   
   /**
      Reads a file with bank account records.
      @param filename file containing account records with the format
            accountNumber1 balance1
            accountNumber2 balance2
            ...
   */
   public void readFile(String filename) throws IOException
   {
      Scanner in = new Scanner(new File(filename));
      read(in);
      in.close();
   }
   
   /**
      Reads the account number, balance of an account from 
      the input stream and adds it to this bank
      @param in the input stream
   */
   private void read(Scanner in) throws BadDataException
   {
      while (in.hasNext())
      {
         BankAccount account = new BankAccount();
         account.read(in);
         accounts.add(account); 
      }
   }
   
   /**
      Finds the account within this bank with the largest 
      balance.
      @return the account with the largest balance.
   */
   public BankAccount getLargestAccount()
   {
      BankAccount largest = accounts.get(0);
      for (int i = 1; i < accounts.size(); i++)
      {
         BankAccount account = accounts.get(i);
         if (account.getBalance() > largest.getBalance())
         {
            largest = account;
         }
      }
      
      return largest;
   }
}