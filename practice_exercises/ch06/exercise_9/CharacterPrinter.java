import java.util.Scanner;

/**
    This program read a word and prints each character of the words
    on a seperate line.
*/
public class CharacterPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Word: ");
        String word = in.next();
        
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            System.out.println(ch);
        }
    }   
}    