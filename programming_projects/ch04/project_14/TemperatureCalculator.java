import java.util.Scanner;

/**
        This program simulates a pipe clip temperature sensor by calculating
        the temperature of liquids in pipes
*/
public class TemperatureCalculator
{
        public static void main(String[] args)
        {
                // Parameters of the thermistor used in the pipe clip temperature sensor
                final int THERMISTOR_RESISTANCE = 1075;
                final int THERMISTOR_TEMPERATURE = 85;
                final int BETA = 3969;
                final int K = 273;      // K is the value used for the conversion
                                        // from celsius to Kelvin and vice-versa 
                
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a value for the resistance of the thermistor: ");
                double resistance = in.nextDouble();
                
                int temperature = (int) (BETA * (THERMISTOR_TEMPERATURE + K) / ((THERMISTOR_TEMPERATURE + K)
                        * Math.log(THERMISTOR_RESISTANCE / resistance) + BETA) - K);
                         
                System.out.println("Temperature of the liquid in the pipe is " + temperature + " degree Celcius");                        
        }
}