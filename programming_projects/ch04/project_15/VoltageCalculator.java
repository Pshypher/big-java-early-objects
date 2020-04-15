import java.util.Scanner;

/**
        This program calculates the source voltage of a power company and investigates the
        significance of the power factor prompting the user to enter different values each
        time the program is run 
*/
public class VoltageCalculator
{
        public static void main(String[] args)
        {
                final int POWER = 260;
                final int RESISTANCE = 10;
                final int VT = 120;     /** VT (terminal voltage) is the voltage 
                                                accessed by plugging into a wall outlet
                                        */
                                             
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the value for a power factor (between 0 and 1): ");
                double powerFactor = in.nextDouble();
                
                double a = 2 * RESISTANCE * POWER / VT;
                int sourceVoltage = (int) (Math.sqrt(Math.pow(VT + a, 2) + Math.pow(a 
                        / powerFactor, 2) * (1 - powerFactor * powerFactor)));
                        
                System.out.println("Source Voltage is " + sourceVoltage + " Vrms");                                 
        }
}