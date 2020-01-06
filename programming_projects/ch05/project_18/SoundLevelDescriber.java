import java.util.Scanner;
/**
        This program reads a unit dB (decibels) or Pa (Pascals) and a corresponding
        measure of the unit, the description of the sound level is displayed
*/

public class SoundLevelDescriber
{
        public static void main(String[] args)
        {
                final double SOUND_LEVEL1 = 130;
                final double SOUND_LEVEL2 = 120;
                final double SOUND_LEVEL3 = 100;
                final double SOUND_LEVEL4 = 90;
                final double SOUND_LEVEL5 = 60;
                final double SOUND_LEVEL6 = 30;
                
                final double REFERENCE_SOUND_PRESSURE = 20E-6;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a unit \"dB\" -Sound Level or \"Pa\" -Sound Pressure: ");
                String unit = in.next();
                
                if (unit.equalsIgnoreCase("dB"))
                {
                        System.out.print("Enter a value for the sound level at least 0dB: ");
                        double soundLevel = in.nextDouble();
                        
                        if (soundLevel < 0)
                                System.out.print("Error: Sound level should be at least 0 decibels");
                        else
                        {
                                String description;
                                if (soundLevel >= SOUND_LEVEL1)
                                        description = "Threshold of pain";
                                else if (soundLevel >= SOUND_LEVEL2)
                                        description = "Possible hearing damage";
                                else if (soundLevel >= SOUND_LEVEL3)
                                        description = "Jack hammer at 1m";
                                else if (soundLevel >= SOUND_LEVEL4)
                                        description = "Traffic on a busy roadway at 10m";
                                else if (soundLevel >= SOUND_LEVEL5)
                                        description = "Normal conversation";
                                else if (soundLevel >= SOUND_LEVEL6)
                                        description = "Calm library";
                                else
                                        description = "Light leaf rustling";
                                        
                                System.out.println("Sound level: " + soundLevel);
                                System.out.println("Description: " + description);                                          
                        }
                }
                else if (unit.equalsIgnoreCase("Pa"))
                {
                        System.out.print("Enter a value for the sound pressure: ");
                        double soundPressure = in.nextDouble();
                        
                        double soundLevel = 20 * Math.log10(soundPressure / REFERENCE_SOUND_PRESSURE);
                        
                         String description;
                         if (soundLevel >= SOUND_LEVEL1)
                                description = "Threshold of pain";
                         else if (soundLevel >= SOUND_LEVEL2)
                                description = "Possible hearing damage";
                         else if (soundLevel >= SOUND_LEVEL3)
                                description = "Jack hammer at 1m";
                         else if (soundLevel >= SOUND_LEVEL4)
                                description = "Traffic on a busy roadway at 10m";
                         else if (soundLevel >= SOUND_LEVEL5)
                                description = "Normal conversation";
                         else if (soundLevel >= SOUND_LEVEL6)
                                description = "Calm library";
                         else
                                description = "Light leaf rustling";
                                
                        System.out.println("Sound pressure: " + soundPressure);
                        System.out.printf("Sound level:    %.2f", soundLevel);
                        System.out.println();
                        System.out.println("Description:    " + description);                                 
                }
                
        }
}
