package exercise_7;

public class SquareSequence implements Sequence
{
    private int n;
    
    public int next()
    {
        n++;
        return n * n; 
    }
}
