package exercise_5;

public class MultiplierSequence implements Sequence
{
    private int m;
    private int n;
    
    public MultiplierSequence(int multiple)
    {
        m = multiple;   
    }
     
    public int next()
    {
        n++;
        return m * n; 
    }
}