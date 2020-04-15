import java.util.Scanner;

/**
    This program determines the month with the highest temperature.
*/
public class Temperature
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Average maximum temperatures" );
        double highestValue = in.nextDouble();
        int highestMonth = 1;
        
        for (int currentMonth = 2; currentMonth <= 12; currentMonth++)
        {
            double nextValue = in.nextDouble();
            if (nextValue > highestValue)
            {
                highestValue = nextValue;
                highestMonth = currentMonth;
            }
        }
        System.out.println(highestMonth);
    }
}
