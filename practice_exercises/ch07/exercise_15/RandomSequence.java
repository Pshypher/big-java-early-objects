import java.util.Arrays;
import java.util.Random;

public class RandomSequence
{
    public static void main(String[] args)
    {
        final int SIZE = 20;
        
        Random generator = new Random();
        int[] values = new int[SIZE];
        
        for (int i = 0; i < SIZE; i++)
        {
            values[i] = generator.nextInt(100);
        }
        
        System.out.println("Before sort:");
        for (int n : values)
        {
            System.out.print(n + " ");
        }
        System.out.println();
        
        Arrays.sort(values);
        
        System.out.println("After sort:");
        for (int n : values)
        {
            System.out.print(n + " ");
        }
    }   
}