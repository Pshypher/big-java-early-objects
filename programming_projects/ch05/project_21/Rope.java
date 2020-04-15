import java.util.Scanner;

/**
        This program simulates a stone tied to a taut rope and 
        checks what rotation speeds would cause the rope to break
*/
public class Rope
{
        public static void main(String[] args)
        {
                final double MASS = 2;
                final double LENGTH = 3;
                final double MAXIMUM_TENSION = 60;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the rotation speed of the rope: ");
                double velocity = in.nextDouble();
                
                double tension = MASS * velocity * velocity / LENGTH;
                
                String output;
                if (tension > MAXIMUM_TENSION)
                        output = "The rotation speed " + velocity +
                                " mps causes the rope to break.";
                else
                        output = "The rope can withstand the tension of " +
                                tension + " Newtons.";
                                
                System.out.print(output);                                                                       
        }
}