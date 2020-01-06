import java.util.Scanner;

/**
        This program calculates the electrical force that exists between
        two charged particles that are a certain distance apart
*/
public class ElectricForceCalculator
{
        public static void main(String[] args)
        {
                final double EPSILON = 8.854E-12;
                
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a value for the charge of the first particle: ");
                double firstParticleCharge = in.nextDouble();
                System.out.print("Enter a value for the charge of the second particle: ");
                double secondParticleCharge = in.nextDouble();
                System.out.print("Enter the distance between both particles: ");
                double distance = in.nextDouble();
                
                double force = firstParticleCharge * secondParticleCharge / 
                        (4 * Math.PI * EPSILON * distance * distance);
                        
                System.out.println("Electrical Force: " + force);                         
        }
}