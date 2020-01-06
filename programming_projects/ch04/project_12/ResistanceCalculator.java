import java.util.Scanner;

/**
        This program calculates the total resistance for circuit of two parallel
        resistors connected to another resistor in series
*/
public class ResistanceCalculator
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the resistance of the first resistor " +
                        "connected in series with the other two: ");
                double r1 =  in.nextDouble();
                System.out.print("Enter the resistance of the second resistor "
                        + "connected in parallel with the third resistor: ");
                double r2 = in.nextDouble();
                System.out.print("Enter the resistance of the third resistor: ");
                double r3 = in.nextDouble();
                
                double total = r1 + 1 / (1 / r2 + 1 / r3);
                System.out.print("Total Resistance: " + total);                                             
        }
}