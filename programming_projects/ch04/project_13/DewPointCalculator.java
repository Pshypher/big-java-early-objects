import java.util.Scanner;

/**
        This program calculates the dew point temperature Td from the relative humidity
        RH and the actual temperature T
*/
public class DewPointCalculator
{
        public static void main(String[] args)
        {
                final double A = 17.27;
                final double B = 237.7;
                
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the relative humidity (between 0 and 1): ");
                double relativeHumidity = in.nextDouble();
                System.out.print("Enter the temperature (in degrees C): ");
                double temp = in.nextDouble();
                
                double f = A * temp / (B + temp) + Math.log(relativeHumidity);  // Intermediate step 
                                                        // used to calculate the dew point temperature
                double dewPointTemp = B * f / (A - f);
                
                System.out.println("Dew Point Temperature: " + dewPointTemp);
        }
}