import java.util.Scanner;

/**
        This program computes and displays the income tax according
        to the tax schedule of the U.S. income tax of 1913
*/
public class IncomeTax
{
        public static void main(String[] args)
        {
                // Constants
                final double RATE1 = 0.01;
                final double RATE2 = 0.02;
                final double RATE3 = 0.03;
                final double RATE4 = 0.04;
                final double RATE5 = 0.05;
                final double RATE6 = 0.06;
                
                final double RATE1_LIMIT = 50000;
                final double RATE2_LIMIT = 75000;
                final double RATE3_LIMIT = 100000;
                final double RATE4_LIMIT = 250000;
                final double RATE5_LIMIT = 500000;
                
                double tax1 = 0;
                double tax2 = 0;
                double tax3 = 0;
                double tax4 = 0;
                double tax5 = 0;
                double tax6 = 0;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter the income: ");
                double income = in.nextDouble();
                
                if (income <= RATE1_LIMIT)
                {
                        tax1 = RATE1 * income;
                }
                else if (income > RATE1_LIMIT)
                {
                        tax1 = RATE1 * RATE1_LIMIT;
                        tax2 = RATE2 * (income - RATE1_LIMIT);
                }
                else if (income > RATE2_LIMIT)
                {
                        tax1 = RATE1 * RATE1_LIMIT;
                        tax2 = RATE2 * (RATE2_LIMIT - RATE1_LIMIT);
                        tax3 = RATE3 * (income - RATE3_LIMIT);
                }
                else if (income > RATE3_LIMIT)
                {
                        tax1 = RATE1 * RATE1_LIMIT;
                        tax2 = RATE2 * (RATE2_LIMIT - RATE1_LIMIT);
                        tax3 = RATE3 * (RATE3_LIMIT - RATE2_LIMIT);
                        tax4 = RATE4 * (income - RATE4_LIMIT);
                }
                else if (income > RATE4_LIMIT)
                {
                        tax1 = RATE1 * RATE1_LIMIT;
                        tax2 = RATE2 * (RATE2_LIMIT - RATE1_LIMIT);
                        tax3 = RATE3 * (RATE3_LIMIT - RATE2_LIMIT);
                        tax4 = RATE4 * (RATE4_LIMIT - RATE3_LIMIT);
                        tax5 = RATE5 * (income - RATE5_LIMIT);
                }
                else if (income > RATE5_LIMIT)
                {
                        tax1 = RATE1 * RATE1_LIMIT;
                        tax2 = RATE2 * (RATE2_LIMIT - RATE1_LIMIT);
                        tax3 = RATE3 * (RATE3_LIMIT - RATE2_LIMIT);
                        tax4 = RATE4 * (RATE4_LIMIT - RATE3_LIMIT);
                        tax5 = RATE5 * (RATE5_LIMIT - RATE4_LIMIT);
                        tax6 = RATE6 * (income - RATE5_LIMIT);
                }
                
                double incomeTax = tax1 + tax2 + tax3 + tax4
                         + tax5 + tax6;
                System.out.println("Income Tax: " + incomeTax);                         
        }
}