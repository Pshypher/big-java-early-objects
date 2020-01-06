package exercise_7;

public interface Sequence
{
    int next();
    
    default int[] values(int n)
    {
        int[] valuesOfSequence = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            valuesOfSequence[i] = next();
        }
        
        return valuesOfSequence;
    }
    
    default void process(LastDigitDistribution dist, int valuesToProcess)
    {        
        for (int i = 1; i <= valuesToProcess; i++)
        {
            int value = next();
            int lastDigit = value % 10;
            dist.addToCounter(lastDigit);
        }
    }
}
