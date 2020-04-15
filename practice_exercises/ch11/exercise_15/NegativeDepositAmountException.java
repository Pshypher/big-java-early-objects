public class NegativeDepositAmountException extends IllegalArgumentException
{
   public NegativeDepositAmountException() {}
   public NegativeDepositAmountException(String message)
   {
      super(message);
   }
}