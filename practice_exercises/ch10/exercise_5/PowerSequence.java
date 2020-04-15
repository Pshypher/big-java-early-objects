package exercise_5;

public class PowerSequence implements Sequence
{
    private int n;
    private int x;
    
    public PowerSequence(int exponent)
    {
        x = exponent;
    }
    
    public int next()
    {
        n++;
        return (int) Math.pow(n, x);
    }
}