import java.util.Scanner;

/**
    Reads a line of input as a String and prints 
        a. Uppercase letters 
        b. Every second letter in each word
        c. The string with all vowels replaced
        d. The number of vowels in the string
        e. The position of all vowels in the string
*/
public class TextUtil
{
    public static void main(String[] args)
    {
        final String VOWELS = "aeiouyAEIOUY";
        
        Scanner in = new Scanner(System.in);
        
       
        boolean done = false;
        int sub = 0;
        String upperCaseLetters = "";
        String secondLetters = "";
        int vowels = 0;
        String withoutVowels = "";
        String vowelPositions = "";
        
        
        System.out.println("Enter words, terminate with a period.");       
        while (!done)
        {
            String word = in.next();
            if (word.charAt(word.length() - 1) == '.')
            {
                done = true;
            }
            for (int i = 0; i < word.length(); i++)
            {
                char ch = word.charAt(i);
                if (Character.isUpperCase(ch))
                {
                    upperCaseLetters = upperCaseLetters 
                        + ch + " ";
                }
                
                if (i == 1) 
                { 
                    secondLetters = secondLetters 
                        + ch + " "; 
                }
                
                if (VOWELS.indexOf(ch) >= 0)
                {
                    withoutVowels = withoutVowels + "_";
                    vowels++;
                    vowelPositions = vowelPositions 
                        + sub + " ";
                }
                else
                {
                    withoutVowels = withoutVowels + ch;
                }
                
                sub++;
            }
            
            withoutVowels = withoutVowels + " ";
        }
        
        System.out.println("Uppercase letters " + upperCaseLetters);
        System.out.println("Second letters " + secondLetters);
        System.out.println(withoutVowels);
        System.out.println("Number of vowels " + vowels);
        System.out.println("Vowel positions " + vowelPositions);
        
    }
}