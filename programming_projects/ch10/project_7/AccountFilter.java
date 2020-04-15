package project_7;

public class AccountFilter implements Filter
{
   public boolean accept(Object obj)
   {
      final double MIN_ALLOWED_BALANCE = 1000;
      
      BankAccount account = (BankAccount) obj;
      return account.getBalance() >= MIN_ALLOWED_BALANCE;
   }
}