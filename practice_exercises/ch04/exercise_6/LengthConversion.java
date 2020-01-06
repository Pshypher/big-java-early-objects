import java.util.Scanner;

/**
        This program converts a measurement in meters to miles, feet, and inches
*/
public class LengthConversion
{
        public static void main(String[] args)
        {
                final double UNIT_METER_IN_MILES = 0.000621373;
                final double UNIT_METER_IN_FEET = 3.28084;
                final double UNIT_METER_IN_INCHES = 39.37008;
                
                // User inputs a measurement in meters
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a measurement in unit meter: ");
                double meters = in.nextDouble();
                
                // Display the conversion from meters to miles
                double meterToMiles = meters * UNIT_METER_IN_MILES;
                System.out.printf("%.2f meters is equivalent to %.2f miles", meters, meterToMiles);
                System.out.println();
                
                 // Display the conversion from meters to feet
                double meterToFeet = meters * UNIT_METER_IN_FEET;
                System.out.printf("%.2f meters is equivalent to %.2f feet", meters, meterToFeet);
                System.out.println();
                
                // Display the result of the conversion from meters to inches
                double meterToInches = meters * UNIT_METER_IN_INCHES;
                System.out.printf("%.2f meters is equivalent to %.2f inches", meters, meterToInches);
                System.out.println();   
        }
}