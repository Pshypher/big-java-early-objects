import java.util.Scanner;

/**
    This program reads a series of stock prices and chooses the stock
    price that is at least the value of the targetPrice stock price 
*/
public class StockPriceDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Target price of stock: ");
        double targetPrice = in.nextDouble();
        
        System.out.println("Enter series of stock prices: ");
        double stockPrice;
        do
        {
            stockPrice = in.nextDouble();
        }
        while (stockPrice < targetPrice);
        System.out.printf("$%.2f exceeds the target price $%.2f\n",
            stockPrice, targetPrice);
    }
}