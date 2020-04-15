import java.util.Scanner;

/**
    This program keeps converting dollars to yen using today's price  
    for a dollar.
*/
public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // The cost of 1 dollar in Japanese yen
        System.out.print("Japanese Yen/USD: ");
        double conversionRate = in.nextDouble();
        
        System.out.print("Enter a sequence of amounts in dollars: ");
        boolean done = false;
        while (!done)
        {
            double amountInDollars = in.nextDouble();
            if (amountInDollars == 0)
            {
                done = true;
            }
            else
            {
                double amountInYen = amountInDollars * conversionRate;
                System.out.printf("USD: %.2f -> JPY: %.2f\n",
                    amountInDollars, amountInYen);
            }             
        }
    }
}