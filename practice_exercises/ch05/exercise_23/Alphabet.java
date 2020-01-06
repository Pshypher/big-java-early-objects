import java.util.Scanner;

/**
        This program classifies each alphabet entered by the user
*/
public class Alphabet
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter an alphabet of letters A-Z,a-z: ");
                String input = in.next();
                
                char alphabet = input.charAt(0);
                
                if (!Character.isLetter(alphabet))
                {
                        System.out.println("Error: Alphabets A-Z, a-z expected");
                }
                else if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") ||
                        input.equalsIgnoreCase("i") || input.equalsIgnoreCase("o") ||
                        input.equalsIgnoreCase("u"))
                {
                        System.out.printf("%s is a vowel\n", input);
                }
                else
                {
                        System.out.printf("%s is a consonant\n", input);
                }                        
        }
}