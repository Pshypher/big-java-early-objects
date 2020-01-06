public class IllegalWithdrawalAmountException extends IllegalArgumentException
{
   public IllegalWithdrawalAmountException() {}
   public IllegalWithdrawalAmountException(String message)
   {
      super(message);
   }
}