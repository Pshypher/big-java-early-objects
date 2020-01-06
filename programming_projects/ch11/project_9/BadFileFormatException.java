import java.io.IOException;

public class BadFileFormatException extends IOException
{
   public BadFileFormatException() {}
   public BadFileFormatException(String message)
   {
      super(message);
   }
}