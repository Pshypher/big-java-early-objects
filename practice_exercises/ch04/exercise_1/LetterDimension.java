/**
        This program displays the size of a letter in millimeter
*/
public class LetterDimension
{
        public static void main(String[] args)
        {
                // The dimensions of the letter in inches
                final double LETTER_WIDTH_INCHES = 8.5; 
                final double LETTER_LENGTH_INCHES = 11;
                
                final double MILLIMETER_PER_INCH = 25.4;
                
                
                
                System.out.printf("Width of the letter: %7.2f millimeter\n", 
                        LETTER_WIDTH_INCHES * MILLIMETER_PER_INCH);
                System.out.printf("Length of the letter: %6.2f millimeter\n",
                        LETTER_LENGTH_INCHES * MILLIMETER_PER_INCH);                        
        }
}