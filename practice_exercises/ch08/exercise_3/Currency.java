public class Currency
{
    public static final double PENNIES = 100;
    
    public static final int BILL = 0;
    public static final int COIN = 1;
    
    public static enum Type { BILL, COIN };
    
    private double value;
    private String name;
    private Type type;
       
    /**
        Construct a Currency either a bill or coin with the specified
        name and value.
        @param currencyValue value of a single unit of the bill or coin.
        @param currencyName name of the currency.
        @param currencyType type of the currency, can be either a bill or coin. 
    */
    public Currency(double currencyValue, String currencyName, int currencyType)
    {
        value = currencyValue;
        name = currencyName;
        
        switch (currencyType)
        {
            case BILL:
                type = Type.BILL;
                break;
            default:
                type = Type.COIN;              
        }
    }
    
    /**
        Get the amount of a single unit of this Currency
        @return the value of this Currency
    */
    public double getValue()
    {
        return value;
    }
    
    /**
        Get the name of this Currency
        @return the name of the Currency
    */
    public String getName()
    {
        return name;
    }
}