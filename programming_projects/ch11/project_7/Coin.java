import java.util.Scanner;

/**
    A coin with a monetary value.
*/
public class Coin
{
   private double value;
   private String name;
   
   /**
      Default constructor for a coin
   */
   public Coin() {}

   /**
       Constructs a coin.
       @param aValue the monetary value of the coin
       @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
       Gets the coin value.
       @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
       Gets the coin name.
       @return the name
   */
   public String getName() 
   {
      return name;
   }
   
   /**
      Reads a coin name and value from an input stream
      @param in the input stream
   */
   public void read(Scanner in) throws BadCoinDataException
   {
      name = in.next();
      
      if (!in.hasNextDouble()) 
      {
         String token = in.next();
         throw new BadCoinDataException(token + " not a legal coin value");
      }
      
      value = in.nextDouble();
   }
}
