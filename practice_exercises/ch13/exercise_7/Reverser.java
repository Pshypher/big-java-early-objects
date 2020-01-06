/**
   Reverses a string using the method of iteration
*/
public class Reverser
{
   public static void main(String[] args)
   {
      String sentence = "A man, a plan, a canal, panama!";
      String reversed = reverse(sentence);
      System.out.println(sentence);
      System.out.println("Reversed: " + reversed);
   }
   
   /**
      Reverse a string.
      @param text the string to be reversed
      @return the reversed string
   */
   public static String reverse(String text)
   {
      String reversedText = "";
      for (int i = 0; i < text.length(); i++)
      {
         reversedText = text.charAt(i) + reversedText;
      }
      
      return reversedText;
   }
}