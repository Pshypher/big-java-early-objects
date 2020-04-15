import java.io.IOException;
import java.util.Scanner;

/**
   This program finds the account with the largest balance 
   within a bank
*/
public class LargestAccount
{
   public static void main(String[] args)
   {
      boolean done = false;
      
      while (!done)
      { 
         try
         {
            System.out.print("File name: ");
            Scanner console = new Scanner(System.in);
            String filename = console.next();
            
            Bank bank = new Bank();
            bank.readFile(filename);
            
            BankAccount account = bank.getLargestAccount();
            System.out.println(account);
            
            done = true;
         }
         catch (IOException exception)
         {
            System.out.println(exception.getMessage());
         }   
      }
   }
}