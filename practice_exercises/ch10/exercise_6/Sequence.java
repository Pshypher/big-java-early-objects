package exercise_6;

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
}
