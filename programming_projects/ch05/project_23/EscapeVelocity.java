import java.util.Scanner;

/**
        A launch velocity (in mph) from the surface of Halley's Comet is the input from a user 
        and the program determines whether a jumper will return to the surfae of the comet
*/
public class EscapeVelocity
{
        public static void main(String[] args)
        {
                final double GRAVITATIONAL_CONSTANT = 6.67E-11;
                final double COMET_MASS = 1.3E22;
                final double RADIUS = 1.153E6;
                final double MPS_MPH = 2.237136;        // Conversion factor from meters per
                                                        // second to miles per hour
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a launch velocity (in mph): ");
                double velocityMPH = in.nextDouble();
                
                double escapeVelocity = Math.sqrt(2 * GRAVITATIONAL_CONSTANT * 
                        COMET_MASS / RADIUS) * MPS_MPH;
                
                if (velocityMPH < escapeVelocity)
                        System.out.printf("The jumper will return to the surface "
                                + "at a velocity of %.2f mph\n", velocityMPH);
                else
                {
                        double velocityMPS = velocityMPH * 0.447;       // converts the velocity in miles per hour
                                                                        // to meters per second 
                        double mass = velocityMPS * velocityMPS * RADIUS / 
                                (2 * GRAVITATIONAL_CONSTANT);
                        System.out.printf("The comet has to be at least %.2f kg large to return "
                                + "the jumper to the surface.", mass);                                
                }                                
        }
}