import java.io.IOException;

public class BadCoinDataException extends IOException
{
   public BadCoinDataException() {}
   public BadCoinDataException(String message)
   {
      super(message);
   }
}