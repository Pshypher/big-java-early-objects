package exercise_5;

public interface Sequence
{
    int next();
    
    static Sequence multiplesOf(int n)
    {
        Sequence seq = new MultiplierSequence(n);
        return seq;
    }
    
    static Sequence powersOf(int n)
    {
        Sequence seq = new PowerSequence(n);
        return seq;
    }
    
    default int[] values(int n)
    {
        int[] valuesOfSequence = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            valuesOfSequence[i] = next();
        }
        
        return valuesOfSequence;
    }
}
