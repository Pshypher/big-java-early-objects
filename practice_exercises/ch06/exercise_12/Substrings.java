import java.util.Scanner;

/**
    This program reads a word and prints all substrings,
    sorted by length.
*/
public class Substrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = in.next();
        
        for (int i = word.length() - 1; i >= 0; i--)
        {
            int length = word.length() - i;
            for (int j = 0; j <= word.length() - length; j++)
      
      
            {
                String substr = word.substring(j, j + length);
                System.out.println(substr);
            }  
        }
    }
}