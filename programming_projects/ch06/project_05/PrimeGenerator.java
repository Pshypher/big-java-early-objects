/**
    A prime generator checks if the number generated is a
    prime number before returning it.
*/
public class PrimeGenerator
{

    private int value;
        
    /**
        Constructor begins with 2 as the initial value of this
        prime generator's sequence
    */
    public PrimeGenerator()
    {
        value = 1;
    }
    
    /**
        Checks if the current value is a prime number
        @return a boolean value, true if the number is prime 
        otherwise false
        
    */
    public boolean isPrime()
    {
        // 1 isn't a prime number
        if (value == 1) { return false; }
        
        int divisor = 2;
        boolean prime = true;
        while (divisor < value && prime)
        {
            if (value % divisor == 0)
            {
                prime = false;
            }
            divisor++;
        }
        return prime;
    }
    
    /**
        Generates the next prime in the sequence
        @return an integer that also happens to be a prime number
    */
    public int nextPrime()
    {
        if (isPrime()) { value++; }
        
        while (!isPrime())
        {
            value++;
        }
        return value;
    }
}