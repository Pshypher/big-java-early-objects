import java.util.Scanner;

/**
    Computes the alternating sum of elements in an array
    1 - 4 + 9 - 16 + 9 - 7 + 4 - 9 + 11 = -2
*/
public class AlternateSum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Please enter values, Q to quit:");
        ArrayUtil values = new ArrayUtil(100);
    
        while (in.hasNextInt())
        {
            if (!values.add(in.nextInt()))
            {
                System.out.println("No more values can be added.");
                return;
            } 
        }
        
        System.out.println("Alternate sum = " + values.sum());
    }
}