/**
   This program demonstrates catching exceptions generated from 
   the BankAccount class and the output displayed via each handler 
*/
public class CatchingExceptions
{
   public static void main(String[] args)
   {
      try
      {
         BankAccount account = new BankAccount(150);
         account.deposit(20);
         account.withdraw(200);
      }
      catch (NegativeInitialBalanceException exception)
      {
         System.out.println("Error: Initial balance is less than 0.");
      }
      catch (NegativeDepositAmountException exception)
      {
         System.out.println(exception.getMessage());
      }
      catch (IllegalWithdrawalAmountException exception)
      {
         exception.printStackTrace();
      }
   }
}