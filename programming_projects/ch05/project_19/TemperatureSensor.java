import java.util.Scanner;

/**
        This program simulates an electric circuit designed to measure the
        tempearture of the gas in a chamber
*/
public class TemperatureSensor
{
        public static void main(String[] args)
        {
                final double RS = 75;
                final double VS = 20;
                final double R0 = 100;
                final double K = 0.5;
                final double MINIMUM_VOLTAGE = 12;
                final double MAXIMUM_VOLTAGE = 18;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the voltage of the voltmeter, 12V - 18V: ");
                double voltage = in.nextDouble();
                
                if (voltage < MINIMUM_VOLTAGE || voltage > MAXIMUM_VOLTAGE)
                        System.out.print("Error: The voltage should be at least 12V and at most 18V");
                else
                {
                        double temperature = RS / K * voltage / (VS - voltage)
                                - R0 / K;
                        System.out.printf("Temperature: %.2fC\n", temperature);                                
                }                        
        }        
}