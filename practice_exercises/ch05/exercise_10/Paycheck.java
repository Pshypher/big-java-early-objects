import java.util.Scanner;

/**
        This class displays the calculated wage of an employee, overtime wages
        are calculated at a different rate
*/
public class Paycheck
{
        public static void main(String[] args)
        {
                // Constant(s)
                final double OVERTIME = 1.5;
                final int REGULAR_HOURS = 40;

                double cummulativeWage;

                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);

                System.out.print("Enter the name of an employee: ");
                String name = in.next();
                System.out.print("Please enter the salary of employee: ");
                double salary = in.nextDouble();
                System.out.print("Number of hours " + name);
                System.out.print(" worked(e.g. 1.65 hours): ");
                double hours =  in.nextDouble();

                if (hours > REGULAR_HOURS)
                {
                        cummulativeWage = REGULAR_HOURS * salary + (hours -
                                REGULAR_HOURS) * salary * OVERTIME;
                }
                else
                {
                        cummulativeWage = hours * salary;
                }

                System.out.printf("Employee wage the past week $%.2f", cummulativeWage);
        }
}