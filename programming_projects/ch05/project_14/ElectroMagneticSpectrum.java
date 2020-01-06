import java.util.Scanner;

/**
        This program prompts the user for a wavelength value and prints a description
        of the corresponding part of the electromagnetic spectrum
*/
public class ElectroMagneticSpectrum
{
        public static void main(String[] args)
        {
                final double WAVELENGTH_LIMIT1 = 1E-1;
                final double WAVELENGTH_LIMIT2 = 1E-3;
                final double WAVELENGTH_LIMIT3 = 7E-7;
                final double WAVELENGTH_LIMIT4 = 4E-7;
                final double WAVELENGTH_LIMIT5 = 1E-8;
                final double WAVELENGTH_LIMIT6 = 1E-11;
                
                Scanner in = new Scanner(System.in);
                
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
                        
                System.out.println("Spectrum description: " + description);                                                                                                                                                                                        
        }
}