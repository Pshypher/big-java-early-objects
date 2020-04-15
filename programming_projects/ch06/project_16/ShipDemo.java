import java.util.Scanner;

/**
    This program calculates the cross-sectional area of a
    ship's hull at x from the starboard to the port
*/
public class ShipDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Beam of the ship: ");
        double beam = in.nextDouble();
        System.out.print("Length of the ship: ");
        double length = in.nextDouble();
        System.out.print("Draft of the ship: ");
        double draft = in.nextDouble();
        System.out.print("Position on the x-axis of the ship's hull: ");
        double x = in.nextDouble();
        System.out.print("Number of increments: ");
        int n = in.nextInt();
        
        double area = 0;
        double size = draft / n;
        
        // Iterate through the z-axis 0 to the depth of the draft
        for (double z = 0; z > -draft; z = z - size)
        {
            double yA = Math.abs(beam / 2 * (1 - Math.pow(2 * x / length, 2))
                * (1 - Math.pow(z / draft, 2)));
            double yB = Math.abs(beam / 2 * (1 - Math.pow(2 * x / length, 2))
                * (1 - Math.pow((z + n) / draft, 2)));
            area = area + 0.5 * (yA + yB) * size;
            z = z - size;                                 
        }
        
        System.out.printf("Ship cross-sectional area is %.2f\n", area * 2);
        System.out.println("At x equals " + x);
    }
}