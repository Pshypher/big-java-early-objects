public class SequenceTester
{
    public static void main(String[] args)
    {
        int[] values = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        Sequence sequence = new Sequence(values.length);
        for (int i = 0; i < values.length; i++)
        {
            sequence.set(i, values[i]);
        }
        
        int[] shuffledValues = { 11, 1, 4, 9, 16, 9, 7, 4, 9 };
        Sequence other = new Sequence(shuffledValues.length);
        for (int i = 0; i < shuffledValues.length; i++)
        {
            other.set(i, shuffledValues[i]);
        }
        
        System.out.println("Actual: " + sequence.isPermutationOf(other));
        System.out.println("Expected: true");
        System.out.println();
        
        int[] randomValues = { 11, 11, 7, 9, 16, 4, 1, 4, 9 };
        for (int i = 0; i < randomValues.length; i++)
        {
            other.set(i, randomValues[i]);
        }
        
        System.out.println("Actual: " + sequence.isPermutationOf(other));
        System.out.println("Expected: false");
    }
}