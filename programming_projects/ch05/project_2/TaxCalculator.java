import java.util.Scanner;

/**
        This program calculates the tax based on the marital status of
        an employee and the salary earned.
*/
public class TaxCalculator
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter your income: ");
                double income = in.nextDouble();
                
                System.out.print("Are you married? (Y/N): ");
                String input = in.next();
                
                int status;
                if (input.equals("Y"))
                {
                        status = TaxReturn.MARRIED;
                }
                else
                {
                        status = TaxReturn.SINGLE;
                }
                TaxReturn tax = new TaxReturn(status, income);
                System.out.print("Tax: " + tax.getTax());
        }
}