import java.util.Scanner;

/**
    This program calculates the number of years it takes an
    investment to reach a million dollars at a given rate.
*/
public class Investment
{
    public static void main(String[] args)
    {
        final int TARGET = 1000000;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Initial balance: ");
        double initialBalance = in.nextDouble();
        
        System.out.print("Rate in percent: ");
        double rate = in.nextDouble();
        
        int year = 0;
        double balance = initialBalance;
        while (balance < TARGET)
        {
            double interest = balance * rate / 100;
            balance = balance + interest;
            year++;
        }
        
        System.out.println("Investment after " + year + " years");
        System.out.println("Initial balance of " + initialBalance);
        System.out.printf("At the rate of %.2f is %.2f\n", rate, balance);  
    }
}