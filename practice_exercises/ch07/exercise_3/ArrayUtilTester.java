import java.util.Scanner;

public class ArrayUtilTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double expected = in.nextDouble();
        
        ArrayUtil numbers = new ArrayUtil(100);
        while (in.hasNextDouble())
        {
            if (!numbers.add(in.nextDouble()))
            {
                System.out.println("No more values can be added.");
                return;
            }
        }
        System.out.println("Total: " + numbers.sumWithoutSmallest());
        System.out.println("Expected: " + expected);
    }
}