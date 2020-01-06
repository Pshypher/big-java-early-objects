import java.util.Random;

/**
    This program fills an array with 10 random integers and
    prints every element at an even index, every even element,
    all elements in reverse order and the first and last elements. 
*/
public class ArrayDemo
{
    public static void main(String[] args)
    {
        final int LENGTH = 10;
        
        Random generator = new Random();
        
        int[] values = new int[LENGTH];
        
        // fill array with random numbers
        for (int i = 0; i < values.length; i++)
        {
            values[i] = generator.nextInt(100);
        }
        
        // print elements at even index
        System.out.print("Elements at even index: ");
        for (int i = 0; i < values.length; i = i + 2)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        
        // print even-numbers
        System.out.print("Even elements: ");
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0)
            { System.out.print(values[i] + " "); }
        }
        System.out.println();
        
        // print elements in reverse order
        System.out.print("Array in reverse: ");
        for (int i = values.length - 1; i >= 0; i--)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        
        // display the first and last elements in values
        System.out.print("First element: " + values[0]);
        System.out.println(" last element: " + values[values.length - 1]);
    }
}