import java.util.Scanner;

/**
        This program uses the measures of either the wavelength or
        frequency to descibe the electromagnetic spectrum
*/
public class ElectroMagneticSpectrum
{
        public static void main(String[] args)
        {
                final int WAVELENGTH = 0;
                final int FREQUENCY = 1;
                
                final double WAVELENGTH_LIMIT1 = 1E-1;
                final double WAVELENGTH_LIMIT2 = 1E-3;
                final double WAVELENGTH_LIMIT3 = 7E-7;
                final double WAVELENGTH_LIMIT4 = 4E-7;
                final double WAVELENGTH_LIMIT5 = 1E-8;
                final double WAVELENGTH_LIMIT6 = 1E-11;
                
                final double FREQUENCY_LIMIT1 = 3E9;
                final double FREQUENCY_LIMIT2 = 3E11;
                final double FREQUENCY_LIMIT3 = 4E14;
                final double FREQUENCY_LIMIT4 = 7.5E14;
                final double FREQUENCY_LIMIT5 = 3E16;
                final double FREQUENCY_LIMIT6 = 3E19;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a parameter for describing the spectrum (0 wavelength, 1 frequency): ");
                int parameter = in.nextInt();
                
                if (parameter == WAVELENGTH)
                {
                        System.out.print("Enter the wavelength of the electromagnetic spectrum: ");
                        double wavelength = in.nextDouble();
                        
                        String description;
                        if (wavelength < WAVELENGTH_LIMIT6)
                                description = "gamma rays";
                        else if (wavelength <= WAVELENGTH_LIMIT5)
                                description = "x-rays";
                        else if (wavelength <= WAVELENGTH_LIMIT4)
                                description = "ultraviolet";
                        else if (wavelength <= WAVELENGTH_LIMIT3)
                                description = "visible light";
                        else if (wavelength <= WAVELENGTH_LIMIT2)
                                description = "infrared";
                        else if (wavelength <= WAVELENGTH_LIMIT1)
                                description = "microwaves";
                        else
                                description = "radio waves";
                                
                        System.out.println("Wavelength: " + wavelength);
                        System.out.println("Electromagnetic spectrum: " + description);                                                                                                                                                                                                                        
                        
                }
                else if (parameter == FREQUENCY)
                {
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
                        
                        System.out.println("Frequency: " + frequency);
                        System.out.println("Electromagnetic spectrum: " + description);                                                                                                                                                
                }
                else
                {
                        System.out.print("Error: Either wavelength 0 or frequency 1 can be used to describe");
                        System.out.println(" the electromagnetic spectrum");       
                }
        }
}