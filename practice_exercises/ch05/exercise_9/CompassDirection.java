import java.util.Scanner;

/**
        This program reads the angle entered by the user and 
        prints out the nearest compass direction         
*/
public class CompassDirection
{
        public static void main(String[] args)
        {
                // Constant(s)
                final int NORTH = 0;
                final int EAST = 90;
                final int SOUTH = 180;
                final int WEST = 270 ;
                final int DEGREES = 360;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter the angle in degrees: ");
                int angle = in.nextInt();
                angle = Math.floorMod(angle, DEGREES);
                
                String direction;
                if (angle == NORTH)
                {
                        direction = "N";
                }
                else if (angle < EAST)
                {
                        direction = "NE";
                }
                else if (angle == EAST)
                {
                        direction = "E";
                }
                else if (angle < SOUTH)
                {
                        direction = "SE";
                }
                else if (angle == SOUTH)
                {
                        direction = "S";
                }
                else if (angle < WEST)
                {
                        direction = "SW";
                }
                else if (angle == WEST)
                {
                        direction = "W";
                }
                else
                {
                        direction = "NW";
                }
                System.out.printf("Angle:     %d\n", angle); 
                System.out.printf("Direction: %s\n", direction);
        }
}