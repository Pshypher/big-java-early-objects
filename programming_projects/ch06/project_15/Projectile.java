import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
    This program simulates the projectile motion of a cannon-ball 
    in flight.
*/
public class Projectile
{
    public static void main(String[] args)
    {
        final double GRAVITATIONAL_FORCE = 9.8;
        final double DELTA_T = 0.01;
        final double EPSILON = 1E-12;
        
        Scanner in = new Scanner(System.in);
        Logger.getGlobal().setLevel(Level.OFF);
        
        System.out.print("Enter the initial velocity: ");
        double initialVelocity = in.nextDouble();
        double time = 0;
        double distanceA = 0;
        System.out.println();
        
        double velocity = initialVelocity;
        while (velocity > 0)
        {
            distanceA = distanceA + velocity * DELTA_T;
            velocity = velocity - GRAVITATIONAL_FORCE * DELTA_T;
            time = time + DELTA_T;
            Logger.getGlobal().info("Velocity " + velocity);
            int numSeconds = (int) time;
            Logger.getGlobal().info("Time " + time);
            Logger.getGlobal().info(numSeconds + " seconds");
            if (Math.abs(DELTA_T - time % numSeconds) <= EPSILON)
            {
                
                System.out.printf("%.2f metre(s) after %d second(s).\n",
                    distanceA, numSeconds);
                // Calculating distance using the calculus-book formula
                double distanceB = 0.5 * GRAVITATIONAL_FORCE * time * 
                    time +  initialVelocity * time;
                System.out.printf("%.2f metre(s) after %d second(s).\n",
                    distanceB, numSeconds);
                System.out.println();
            }  
        }
    }
}