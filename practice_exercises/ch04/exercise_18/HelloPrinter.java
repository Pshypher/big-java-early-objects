/**
        This program prints the word HELLO in large size letters
*/

public class HelloPrinter
{
        public static void main(String[] args)
        {
                // Declare constants
                final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n";
                final String LETTER_E = "*****\n*\n*****\n*\n*****\n";
                final String LETTER_L = "*\n*\n*\n*\n*****\n";
                final String LETTER_O = "  **\n *  *\n*    *\n *  *\n  **\n";
                
                // Print out the letters H,E,L,L,O
                System.out.println(LETTER_H);
                System.out.println(LETTER_E);
                System.out.println(LETTER_L);
                System.out.println(LETTER_L);
                System.out.print(LETTER_O);
        }
}