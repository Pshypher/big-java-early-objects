/**
   Describes a coin with a name and numeric value
*/
public class Coin
{

   private String name;
   private double value;
   
   /**
      Construct a coin with the given name and value
      @param coinName name of the coin
      @param coinValue value of the coin
   */
   public Coin(String coinName, double coinValue)
   {
      name = coinName;
      value = coinValue;
   }
   
   /**
      Get the name of this coin
      @return the name of this coin
   */
   public String getName()
   {
      return name;
   }
   
   /**
      Gets the value of this coin
      @return the coin value
   */
   public double getValue()
   {
      return value;
   }
}