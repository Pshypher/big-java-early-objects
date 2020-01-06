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
      Reverses the characters within a text.
      @param text the string to be reversed
      @return the reversed string
   */
   public static String reverse(String text)
   {
      return reverse(text, 0);
   }
      
      /**
         Reverses the substring within a text.
         @param text the substring to be reversed
         @param start the beginning index
         @return the reversed substring
      */
   public static String reverse(String text, int start)
   {
      int length = text.length();
         
      if (start >= length) { 
         return ""; }
      else
      {
         char ch = text.charAt(start);
         return reverse(text, start + 1) + ch; 
      }
   }  
}