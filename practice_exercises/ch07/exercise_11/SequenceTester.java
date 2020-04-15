import java.util.Arrays;

public class SequenceTester
{
    public static void main(String[] args)
    {
        int[] oddValues = { 7, 3, 5, 9 };
        int[] evenValues = { 2, 4, 16, 6, 4, 2, 12 };
        
        Sequence sequence = new Sequence(oddValues.length);
        for (int i = 0; i < oddValues.length; i++)
        {
            sequence.set(i, oddValues[i]);
        } 
        
        Sequence other = new Sequence(evenValues.length);
        for (int i = 0; i < evenValues.length; i++)
        {
            other.set(i, evenValues[i]);
        }
        
        System.out.println("Actual: " + sequence.equals(other));
        System.out.println("Expected: false");
        System.out.println();
        
        other = new Sequence(oddValues.length);
        for (int i = 0; i < oddValues.length; i++)
        {
            other.set(i, oddValues[i]);
        }
        
        System.out.println("Actual: " + other.equals(sequence));
        System.out.println("Expected: true");
        System.out.println();
        
        int[] randomValues = Arrays.copyOf(evenValues,  evenValues.length);
        randomValues[2] = 7;
        randomValues[randomValues.length - 1] = 5;
        other = new Sequence(randomValues.length);
        for (int i = 0; i < randomValues.length; i++)
        {
            other.set(i, randomValues[i]);
        }
        
        sequence = new Sequence(evenValues.length);
        for (int i = 0; i < evenValues.length; i++)
        {
            sequence.set(i, evenValues[i]);
        }
        
        System.out.println("Actual: " + sequence.equals(other));
        System.out.println("Expected: false");
    }
}