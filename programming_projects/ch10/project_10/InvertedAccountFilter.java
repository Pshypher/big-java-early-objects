package project_10;

public class InvertedAccountFilter implements Filter
{
   public boolean accept(Object obj)
   {
      Filter condition = new AccountFilter();
      BankAccount account = (BankAccount) obj;
      return condition.reject(account);
   }
}