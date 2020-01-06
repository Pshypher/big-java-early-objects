public class SubstringMatcher
{
   public static void main(String[] args)
   {
      String text1 = "Mississipi";
      String substr1 = "sip";
      System.out.println("Actual: " + find(text1, substr1));
      System.out.println("Expected: true");
      
      String text2 = "Arizona";
      String substr2 = "rim";
      System.out.println("Actual: " + find(text2, substr2));
      System.out.println("Expected: false"); 
   }
   
   /**
      Checks whether a text contains a given substring.
      @param text the larger string for which a substring is searched
      @param str the substring to be found
      @return true if the substring was found,false otherwise 
   */
   public static boolean find(String text, String str)
   {  
      int textLength = text.length();
      int strLength = str.length();
      
      if (strLength > textLength) { 
         return false; }
      else  
      {
         String substr = text.substring(0, strLength);
         if (str.equals(substr))
         {
            return true;
         }
         else
         {
            String shorter = text.substring(1);
            return find(shorter, str);
         }
      }
   }
}