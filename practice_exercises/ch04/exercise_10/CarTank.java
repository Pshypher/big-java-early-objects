import java.util.Scanner;

/**
        This program calculates the cost accrued by a car per 100 miles of gas used
        and how far the car can travel with the gas in the tank
*/
public class CarTank
{
        public static void main(String[] args)
        {
                final double UNIT_MILES = 100.0;
                 
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the number of gallons of gas in the tank: ");
                double gallons = in.nextDouble();
                System.out.print("Enter the fuel efficiency in miles per gallon: ");
                double fuelEfficiency = in.nextDouble();
                System.out.print("Enter the price of gas per gallon: ");
                double pricePerGallon = in.nextDouble();
                System.out.println();
                
                double gasUsed = UNIT_MILES / fuelEfficiency; // Calculates the number of gallons
                                                                // for every 100 miles travelled
                double cost = gasUsed * pricePerGallon;
                System.out.printf("Cost of gas per 100 miles travelled: $%.2f\n", cost);
                
                double maximumDistance = fuelEfficiency * gallons;
                System.out.printf("The maximum distance that can be travelled with %.2f " +
                        "gallons of gas is %.2f miles.\n", gallons, maximumDistance);
        }
}