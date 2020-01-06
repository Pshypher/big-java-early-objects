import java.util.Scanner;

/**
    Counts the number of vowels in a word (a,e,i,o,u,y)
*/
public class VowelCount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Text: ");
        String text = in.next();
        int vowels = 0;
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            String substring = String.valueOf(ch);
            if ("AEIOUYaeiouy".contains(substring))
            {
                vowels++;
            }
        }
        System.out.printf("%d vowels in %s\n", vowels, text);
    }
}