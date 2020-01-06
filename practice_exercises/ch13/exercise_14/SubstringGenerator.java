import java.util.ArrayList;

/**
   This program lists the substrings within a string
*/
public class SubstringGenerator
{
   public static void main(String[] args)
   {
      ArrayList<String> substrings = generateSubstrings("rum");
      
      for (String s : substrings)
      {
         System.out.print("\"");
         System.out.print(s);
         System.out.println("\"");
      }
   }
   
   /**
      Gets all the substrings of a string.
      @param str the strings whose substrings are generated
      @return a list of substrings within a string
   */
   public static ArrayList<String> generateSubstrings(String str)
   {
      ArrayList<String> substrings = new ArrayList<String>();
      
      if (str.length() == 0) 
      {
         substrings.add("");
         return substrings; 
      }
      else
      {
         for (int i = 0; i < str.length(); i++)
         {
            substrings.add(str.substring(0, i + 1));
         }
         
         // Remove the first character
         String shorter = str.substring(1);
         
         // Generate a list of substrings from the shorter string
         ArrayList<String> shorterSubstrings = generateSubstrings(shorter);
         
         for (String s : shorterSubstrings)
         {
            substrings.add(s);
         }
         
         return substrings;
      }
   }
}