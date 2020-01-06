public class Reverser
{
   public static void main(String[] args)
   {
      String str1 = "Hello!";
      System.out.println("Text: " + str1);
      System.out.println("Reverse: " + reverse(str1));
      
      String str2 = "!olleH";
      System.out.println("Text: " + str2);
      System.out.println("Reverse: " + reverse(str2));
   }
   
   /**
      Reverses a string.
      @param text the string to be reversed
      @return the reversed string
   */
   public static String reverse(String text)
   {
      int length = text.length();
      if (length == 0) { 
         return ""; }
      else
      {  
         char first = text.charAt(0);
         String shorter = text.substring(1, length);
         return reverse(shorter) + first;
      }                  
   }
}