public class SubstringMatcher
{
   public static void main(String[] args)
   {
      String text1 = "Mississipi";
      String substr1 = "sip";
      int index = indexOf(text1, substr1);
      System.out.println("Actual: " + index);
      System.out.println("Expected: 6");
      
      String text2 = "Arizona";
      String substr2 = "rim";
      index = indexOf(text2, substr2);
      System.out.println("Actual: " + index);
      System.out.println("Expected: -1"); 
   }
   
   /**
      Finds the position of the first substring within a text 
      that matches a given substring.
      @param text the text within which a substring is searched for
      @param str the substring whose index is determined within a 
      text
      @return the index of the substring if found, -1 otherwise 
   */
   public static int indexOf(String text, String str)
   {
      return indexOf(text, str, 0);
   }
   
   /**
      Finds the position of the first substring within a larger substring 
      that matches a given substring.
      @param text the larger substring containing the substring whose 
      position is to be found
      @param str the substring whose position is returned on the first match
      @param start the index to start the search of the substring within the
      larger substring
      @return index of the substring if found, -1 otherwise
   */
   public static int indexOf(String text, String str, int start)
   {
      int textLength = text.substring(start).length();
      int substrLength = str.length();
      int end = start + substrLength;
      
      if (substrLength > textLength) { 
         return -1; }
      else  
      {
         String substr = text.substring(start, end);
         if (str.equals(substr))
         {
            return start;
         }
         else
         {
            return indexOf(text, str, start + 1);
         }
      }
   }
}