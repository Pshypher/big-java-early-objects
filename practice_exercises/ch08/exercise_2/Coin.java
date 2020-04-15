public class Coin
{
    public static final int PENNIES = 100;
        
    private double value;
    private String name; 
       
    /**
        Construct a coin with the specified name and value
    */
    public Coin(double coinValue, String coinName)
    {
        value = coinValue;
        name = coinName;
    }
    
    /**
        Get the amount of a single unit of this Coin
        @return the value of this Coin
    */
    public double getValue()
    {
        return value;
    }
    
    /**
        Get the name of this Coin
        @return the name of the Coin
    */
    public String getName()
    {
        return name;
    }
}