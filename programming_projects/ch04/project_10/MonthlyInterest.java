import java.util.Scanner;

/**
        This program calculates and shows the interest compounded monthly
        on deposits made by prospective customers
*/
public class MonthlyInterest
{
        public static void main(String[] args)
        {
                final int MONTHS_PER_YEAR = 12;
                final int PERCENT = 100; 
                              
                // Constructs an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Initial balance: ");
                double initial = in.nextDouble();
                System.out.print("Annual interest rate in percent: ");
                double annualRate = in.nextDouble();
                double monthlyRate = annualRate / (MONTHS_PER_YEAR * PERCENT);

                
                // Calculate the interest run on the
                // first three months
                double firstMonth = initial + initial * monthlyRate;
                double secondMonth = firstMonth + (firstMonth * monthlyRate);
                double thirdMonth = secondMonth + (secondMonth * monthlyRate);
                
                System.out.printf("After first month:  %8.2f\n", firstMonth);
                System.out.printf("After second month: %8.2f\n", secondMonth);
                System.out.printf("After third month:  %8.2f", thirdMonth);            
        }
}