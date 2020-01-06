import java.util.Scanner;

/**
        This program reads the x and y coordinates of two corner points
        of a rectangle and then prints whether the rectangle is a square
        or is in "portrait" or "landscape" orientation.
*/
public class RectangleOrientation
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                // x- and y-coordinates of the top left corner
                System.out.print("Enter the x coordinate of the top left corner: ");
                int xTopLeft = in.nextInt();
                System.out.print("Enter the y coordinate of the top left corner: ");
                int yTopLeft = in.nextInt();
                
                // x- and y-coordinates of the bottom right corner 
                System.out.print("Enter the x coordinate of the bottom right corner: ");
                int xBottomRight = in.nextInt();
                System.out.print("Enter the y coordinate of the bottom right corner: ");
                int yBottomRight = in.nextInt();
                
                int deltaY = yBottomRight - yTopLeft;
                int deltaX = xBottomRight - xTopLeft;
                
                double slope = Math.abs(deltaY / deltaX);
                
                String orientation;
                if (slope < 1)
                        orientation = "landscape";
                else if (slope > 1)
                        orientation = "portrait";
                else
                        orientation = "square";
        
                System.out.print("Orientation: " + orientation);                                                                        
        }
}
