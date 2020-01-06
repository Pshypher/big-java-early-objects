import java.util.Scanner;

/**
        This program determines the greatest speed a rope can withstand 
        subject to the mass of an object given
*/
public class Rope
{
        public static void main(String[] args)
        {
                final int LENGTH = 3;
                final int MINIMUM_SPEED = 1;
                final int LOW_SPEED = 10;
                final int HIGH_SPEED = 20;
                final int MAXIMUM_SPEED = 40;
                
                final int TENSION = 60;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the mass attached to the end of the rope: ");
                double mass = in.nextDouble();
                
                double minTension = mass * MINIMUM_SPEED * MINIMUM_SPEED / LENGTH;
                double lowTension = mass * LOW_SPEED * LOW_SPEED / LENGTH;
                double highTension = mass * HIGH_SPEED * HIGH_SPEED / LENGTH;
                double maxTension = mass * MAXIMUM_SPEED * MAXIMUM_SPEED / LENGTH;
                
                int maximumSpeed;
                if (TENSION > maxTension)
                        maximumSpeed = MAXIMUM_SPEED;
                else if (TENSION > highTension)
                        maximumSpeed = HIGH_SPEED;
                else if (TENSION > lowTension)
                        maximumSpeed = LOW_SPEED;
                else
                        maximumSpeed = MINIMUM_SPEED;
                        
                System.out.println("Mass: " + mass);
                System.out.println("Accepted speed: " + maximumSpeed);                                                                                               
        }        
}