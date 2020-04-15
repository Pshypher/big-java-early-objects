import java.util.Scanner;

/**
    Reverses the sequence of characters in a string
*/
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Text: ");
        String text = in.next();
        String reversedText = "";
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            reversedText = ch + reversedText;
        }
        System.out.println(reversedText);
    }
}