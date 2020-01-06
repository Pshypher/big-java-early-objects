import java.util.Scanner;

/**
        This program simulates a thermistor and an alram circuit designed 
        to warn of frost.
*/
public class ThermistorAlarm
{
        public static void main(String[] args)
        {
                // Constant(s)
                final double R0 = 33192;
                final double T0 = 40 + 273;
                final double BETA = 3310;
                final double R2 = 156.3E3;
                final double R3 = 156.3E3;
                final double R4 = 156.3E3;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the temperature in degrees Fahrenheit: ");
                double temperatureFahrenheit = in.nextDouble();
                
                // The temperature is altered from fahrenheit to degree kelvin
                double temperatureCelcius = (temperatureFahrenheit - 32) / 1.8;
                double temperature = temperatureCelcius + 273;
                
                double resistance = R0 * Math.exp(BETA * (1 / temperature - 1 / T0));
                
                
                String buzzer;
                if (R2 / (resistance + R2) < R4 / (R3 + R4))
                        buzzer = "Alarm will sound";
                else
                        buzzer = "No noise";
                        
                System.out.printf(buzzer + " at the given temperature %.2fK", 
                        temperature);
        } 
}