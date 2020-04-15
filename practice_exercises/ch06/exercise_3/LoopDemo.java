import java.util.Scanner;
/**
    This program reads and processes a sequence of integer inputs
*/

public class LoopDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        boolean first = false;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        System.out.println("Sequence of integers, Q to quit");
        String duplicates = "";
        String cummulative = "";
        int total = 0;
        int input = 0;
        while (in.hasNextInt())
        {            
            int previous = input;
            input = in.nextInt();
                      
            // find adjacent duplicates
            if (!first) { first = true; }
            else if (input == previous)
            {
                if (duplicates.indexOf("" + input) < 0)
                {
                    duplicates = duplicates + input + " ";
                }
            }
            
            // compute the total of the sequence
            total = total + input;
            cummulative = cummulative + total + " ";
            
            // find the smallest value
            if (input < smallest)
            {
                smallest = input;
            }
            
            // find the largest value
            if (input > largest)
            {
                largest = input;
            }
        }
        System.out.println("Smallest " + smallest);
        System.out.println("Largest " + largest);
        System.out.println("Cummulative total " + cummulative);
        System.out.println("Adjacent duplicates " + duplicates); 
    }
}