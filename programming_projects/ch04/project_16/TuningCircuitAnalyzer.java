import java.util.Scanner;

/**
        This program calculates the inductance and the range of frequencies to
        which a circuit can be tuned by varying the capacitance
*/
public class TuningCircuitAnalyzer
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the base frequency of the circuit (e.g. 16700000Hz): ");
                double baseFrequency = in.nextDouble();
                System.out.print("Enter the minimum capacitance (e.g. 0.000000000014Farad): ");
                double minimumCapacitance = in.nextDouble();
                System.out.print("Enter the maximum capacitance (e.g. 0.000000000365Farad): ");
                double maximumCapacitance = in.nextDouble();
                
                System.out.println();
                
                double meanCapacitance = Math.sqrt(minimumCapacitance * maximumCapacitance);
                double inductance = 4 * Math.PI * Math.PI / 
                        (meanCapacitance * baseFrequency * baseFrequency);
                double minimumFrequency = 2 * Math.PI / Math.sqrt(inductance 
                        * maximumCapacitance);
                double maximumFrequency = 2 * Math.PI / Math.sqrt(inductance
                        * minimumCapacitance);
                        
                System.out.println("Inductance: " + inductance + "H");
                System.out.println("Minimum Frequency: " + minimumFrequency + "Hz");
                System.out.println("Maximum Frequency: " + maximumFrequency + "Hz");                                                                     
        }
}        