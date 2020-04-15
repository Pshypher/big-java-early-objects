public class NegativeInitialBalanceException extends IllegalArgumentException
{
   public NegativeInitialBalanceException() {}
   public NegativeInitialBalanceException(String message)
   {
      super(message);
   }
}