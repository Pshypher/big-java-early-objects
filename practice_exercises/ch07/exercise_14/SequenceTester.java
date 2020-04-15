import java.util.Arrays;

public class SequenceTester
{
    public static void main(String[] args)
    {
        int[] numbers1 = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        Sequence seq = new Sequence(numbers1.length);
        for (int i = 0; i < numbers1.length; i++)
        {
            seq.set(i, numbers1[i]);
        }
        
        int[] numbers2 = { 11, 11, 7, 9, 16, 4, 1 };
        Sequence other = new Sequence(numbers2.length);
        for (int i = 0; i < numbers2.length; i++)
        {
            other.set(i, numbers2[i]);
        }
        
        System.out.println("Actual: " + 
            Arrays.toString(seq.sum(other)));
        System.out.println("Expected: [12, 15, 16, 25, 25, 11, 5, 9, 11]");            
    }
}