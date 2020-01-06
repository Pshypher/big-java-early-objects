import java.util.Scanner;

/**
        This program directs a cashier how to give change
*/
public class Cashier
{
        public static void main(String[] args)
        {
                // Declare constants
                final int QUARTER_VALUE = 25;
                final int DIME_VALUE = 10;
                final int NICKEL_VALUE = 5;
                
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                // The amount due and the amount received from
                // the customer are both in pennies
                System.out.print("Enter the amount due in pennies(e.g. $2.74 is 274 etc.): ");
                int amountDue = in.nextInt();
                System.out.print("Enter the amount received from the customer in pennies"
                        + "(e.g. 3.90 is 390 etc.): ");
                int payment = in.nextInt();
                
                int changeDue = payment - amountDue;
                
                int dollars = changeDue / 100;
                changeDue = changeDue - dollars * 100;
                int quarters = changeDue / QUARTER_VALUE;
                changeDue = changeDue % QUARTER_VALUE;
                int dimes = changeDue / DIME_VALUE;
                changeDue = changeDue % DIME_VALUE;
                int nickels = changeDue / NICKEL_VALUE;
                changeDue = changeDue % NICKEL_VALUE;
                
                // Display the change in dollars, quarters, dimes,
                // nickels and pennies to be received by the customer
                System.out.printf("Dollars: %d\nQuarters: %d\nDimes: %d\nNickels: %d"
                        + "\nPennies: %d", dollars, quarters, dimes, nickels, changeDue);                                         
        }
}