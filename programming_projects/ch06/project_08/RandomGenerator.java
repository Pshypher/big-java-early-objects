/**
    This class generates a random number given an initial seed value 
*/
public class RandomGenerator
{
    public static final int A = 32310901;
    public static final int B = 1729;
    
    private int m;
    private int nextValue;
    
    /**
        Constructs a random generator given an initial
        seed value
        @param seed the seed for this random generator 
    */
    public RandomGenerator(int seed)
    {
        nextValue = seed;
    }
    
    /**
        Reassigns m to a different value.
        It is used to calculate the remainder, which becomes the 
        next random number in the stream of random numbers generated.
        @param divisor value reassigned to m.
    */
    public void setDivisor(int divisor)
    {
        m = divisor;
    }
    
    /**
        Computes the next random integer in the stream of
        numbers generated in this random generator
        @return the next random number in the sequence
    */
    public int nextInt()
    {
        if (m > 0)
        {
            nextValue = (A * nextValue + B) % m;
        }
        else
        {
            nextValue = (A * nextValue + B);
        }
        
        return nextValue;
    }
}