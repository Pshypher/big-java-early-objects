import java.util.Scanner;

/**
        This program using the temperature of water to checks if water
        is solid, liquid or gas 
*/
public class Water
{
        public static void main(String[] args)
        {
                // Constants
                final double FREEZING_POINT_F = 32;
                final double BOILING_POINT_F = 212;
                final double FREEZING_POINT_C = 0;
                final double BOILING_POINT_C = 100;
                final double DELTA_TEMP_FT = 1000;      // Altitude in feet that causes a unit drop in the 
                                                        // temperature of boiling water
                final double DELTA_TEMP_M = 300;        // The altitude that causes a drop in temperature
                                                        // for the boiling point of water in unit meter
                
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a unit for the temperature "
                        + "(C for celcius, F for fahrenheit): ");
                String unit = in.next();
                System.out.print("Enter a value for the temperature: ");
                double temperature = in.nextDouble();
                                                       
                String state;
                if (unit.equals("C"))
                {                          
                        if (temperature < FREEZING_POINT_C)
                        {
                                state = "solid ice";
                        }
                        else if (temperature > BOILING_POINT_C)
                        {
                                state = "gaseous steam";
                        }
                        else
                        {
                                state = "liquid";
                        }       
                }               
                else
                {
                        if (temperature < FREEZING_POINT_F)
                        {
                                state = "solid ice";
                        }
                        else if (temperature > BOILING_POINT_F)
                        {
                                state = "gaseous steam";
                        }
                        else
                        {
                                state = "liquid";
                        }
                }
                System.out.println("Water is " + state);
        }                
}