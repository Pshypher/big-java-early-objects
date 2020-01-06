/**
        This program calculates the perimeter of a letter and 
        calculates the size of the diagonal 
*/
public class LetterDimension
{
        public static void main(String[] args)
        {
                // The dimensions of the letter in unit inches
                final double LETTER_LENGTH = 11;
                final double LETTER_WIDTH = 8.5;
                
                // Calculate and print the perimeter of the letter which 
                // is exactly the same shape as a rectangle
                double perimeter = 2 * LETTER_LENGTH + 2 * LETTER_WIDTH;
                System.out.printf("Perimeter:       %5.2f inches\n", perimeter);
                
                // Calculate and display the length of the diagonal
                double diagonalSize = Math.sqrt(Math.pow(LETTER_LENGTH, 2) + 
                        Math.pow(LETTER_WIDTH, 2));
                System.out.printf("Diagonal length: %5.2f inches\n", diagonalSize);
        }
}