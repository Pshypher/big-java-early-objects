import java.util.Random;
import java.util.Scanner;

/**
    This program randomly permutes the characters in a string
*/
public class StringShuffle
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = in.next();
        
        for (int sub = 0; sub < word.length(); sub++)
        {
            int lastIndex = word.length() - 1;
            int i = generator.nextInt(lastIndex);
            int j = i + 1 + generator.nextInt(lastIndex - i);
            String first = word.substring(0, i);
            String middle = word.substring(i + 1, j);
            String last = word.substring(j + 1);
            word = first + word.charAt(j) + middle + word.charAt(i) + last;  
        }
        System.out.println(word);
    }
}