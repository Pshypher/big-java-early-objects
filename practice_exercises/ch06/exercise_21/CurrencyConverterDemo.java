import java.util.Scanner;

/**
    This program keeps converting dollars to yen using today's price  
    for a dollar.
*/
public class CurrencyConverterDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // The cost of 1 dollar in Japanese yen
        System.out.print("Japanese Yen/USD: ");
        double conversionRate = in.nextDouble();
        
        System.out.print("Enter a sequence of amounts in dollars, " 
            + "or 0 to quit: ");
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
            
        System.out.print("Enter amounts in yen to be converted, "
            + "0 to finish: ");
        double amountInYen;
        do
        {
            amountInYen = in.nextDouble();
            if (amountInYen != 0)
            {
                double amountInDollars = amountInYen / conversionRate;
                System.out.printf("JPY: %.2f -> USD: %.2f\n",
                    amountInYen, amountInDollars);
            }
        }
        while (amountInYen != 0);
    }
}