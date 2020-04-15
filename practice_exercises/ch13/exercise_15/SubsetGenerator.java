import java.util.ArrayList;

public class SubsetGenerator
{
   public static void main(String[] args)
   {
      for (String s : generateSubsets("rum"))
      {
         System.out.print("\"");
         System.out.print(s);
         System.out.println("\"");
      } 
   }
   
   /**
      Gets the subsets of all characters in a string.
      @param word the string whose subsets is to be generated
      @return a list of subsets of the characters within a string 
   */
   public static ArrayList<String> generateSubsets(String word)
   {
      ArrayList<String> subsets = new ArrayList<String>();
      
      if (word.length() == 0) 
      {
         subsets.add("");
         return subsets;
      }
      else
      {
         for (int i = 0; i < word.length(); i++)
         {
            String shorter = word.substring(i + 1);
            ArrayList<String> shorterSubsets = generateSubsets(shorter);
            
            for (String s : shorterSubsets)
            {
               String r = word.charAt(i) + s;
               if (!subsets.contains(r)) { subsets.add(r); }
            }
            
            for (String s : shorterSubsets)
            {
               if (!subsets.contains(s)) { subsets.add(s); }
            } 
         }
            
         return subsets;
      }
   }
}