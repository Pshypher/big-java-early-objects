import java.util.Scanner;

/**
   This class determines whether there is a match of a substring
   within a larger a string.
*/
public class TextFinder
{   

   /**
      Reads the lines of a file and searches for the occurence
      of a substring
      @param in scanner object of the input file
      @param text the target substring
      @return the line containing the matched substring
   */
   public String readLine(Scanner in, String text)
   {
      String line = in.nextLine();
      
      if (contains(line, text)) { return line; }
      else { return null; }
   }
   
   /**
      Searches the line for an occurence of the given text
      @param line the searched string
      @param text the target substring
      @return true if the line contains text, otherwise false 
   */
   private boolean contains(String line, String text)
   {
      int pos = find(line, text);
      
      boolean matchFound = false;
      if (pos > 0) { matchFound = true; }
      
      return matchFound;
   }
   
   /**
      Finds the position of a substring within a string
      @param line the string searched
      @param text target substring
      @return beginning index of the target substring
      or -1 if no match is found
   */
   private int find(String line, String text)
   {  
      int i = 0;
      int j = line.length() - text.length();
      boolean found = false;
      
      while (i <= j && !found)
      {
         int end = i + text.length();
         if (line.substring(i, end).equals(text))
         {
            found = true;
         }
         else
         {
            i++;
         }
      }
      
      if (found) { return i; }
      else { return -1; }
   }
}