/**
    This class that generates all the factors of an integer.
*/
public class FactorGenerator
{
    private int numberToFactor;
    /**
        Constructor assigns the number whose factors would be
        returned.
        @param numberToFactor the number whose factors are to
        be generated.
    */
    public FactorGenerator(int numberToFactor)
    {
        this.numberToFactor = numberToFactor;   
    }
    
    /**
        Checks to see if there is any integer factor left.
        @return true if there is still a factor in the number. 
    */
    public boolean hasMoreFactors()
    {
        
        boolean found = false;
        if (numberToFactor < 2)
        {
            return found;
        }
        
        int x = 2;
        while (x < numberToFactor || !found)
        {
            if (numberToFactor % x == 0)
            {
                found = true;
            }
            x++;
        }
        return found;
    }
    
    /**
        Gets the next integer factor from this FactorGenerator.
        @return an integer that evenly divides the numberToFactor
    */
    public int nextFactor()
    {
        int x = 2;
        
        while (x < numberToFactor && numberToFactor % x != 0)
        {
            x++;
        }
        if (numberToFactor % x == 0)
        {
            numberToFactor = numberToFactor / x;
        } 
        return x;
    }
}
