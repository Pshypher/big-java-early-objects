package project_9;

public class AccountFilter implements Filter
{
   private static final double MIN_ALLOWED_BALANCE = 1000;
   
   public boolean accept(Object obj)
   {
      BankAccount account = (BankAccount) obj;
      return account.getBalance() >= MIN_ALLOWED_BALANCE;
   }
}