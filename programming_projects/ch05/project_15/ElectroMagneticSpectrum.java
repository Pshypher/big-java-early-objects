import java.util.Scanner;

/**
        This program prompts the user for the frequency and prints a description
        of the corresponding part of the electromagnetic spectrum
*/
public class ElectroMagneticSpectrum
{
        public static void main(String[] args)
        {
                final double FREQUENCY_LIMIT1 = 3E9;
                final double FREQUENCY_LIMIT2 = 3E11;
                final double FREQUENCY_LIMIT3 = 4E14;
                final double FREQUENCY_LIMIT4 = 7.5E14;
                final double FREQUENCY_LIMIT5 = 3E16;
                final double FREQUENCY_LIMIT6 = 3E19;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the frequency of the electromagnetic spectrum: ");
                double frequency = in.nextDouble();
                
                String description;
                if (frequency > FREQUENCY_LIMIT6)
                        description = "gamma rays";
                else if (frequency >= FREQUENCY_LIMIT5)
                        description = "x-rays";
                else if (frequency >= FREQUENCY_LIMIT4)
                        description = "ultraviolet";
                else if (frequency >= FREQUENCY_LIMIT3)
                        description = "visible light";
                else if (frequency >= FREQUENCY_LIMIT2)
                        description = "infrared";
                else if (frequency >= FREQUENCY_LIMIT1)
                        description = "microwaves";
                else
                        description = "radio waves";
                        
                System.out.println("Spectrum description: " + description);                                                                                                                                                                                        
        }
}