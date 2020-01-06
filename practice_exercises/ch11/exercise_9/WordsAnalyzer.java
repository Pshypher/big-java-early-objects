import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program displays a list of unrecognized words from a 
   given file.
*/
public class WordsAnalyzer
{
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<String> words = new ArrayList<String>();
      
      Scanner in = new Scanner(new File("words.txt"));
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         words.add(line.trim());
      }
      
      in.close();
      
      System.out.print("File name: ");
      Scanner console = new Scanner(System.in);
      String filename = console.next();
      in = new Scanner(new File(filename));
      in.useDelimiter("[^A-Za-z']");
      
      while (in.hasNext())
      {
         String text = in.next();
         if (!contains(words, text))
         {
            if (text.length() > 0) { System.out.println(text); }
         }
      }
   }
   
   /**
      Checks if a word is in the given wordsionary
      @param words dictionary or word list
      @param text the searched string
      @return true if the word is found, false otherwise
   */
   public static boolean contains(ArrayList<String> words, String text)
   {  
      boolean found = false;
      int i = 0;
      while (!found && i < words.size())
      {
         String word = words.get(i);
         if (word.equalsIgnoreCase(text)) 
         {
            found = true;
         }
         else
         {
            i++;
         }
      }
      
      return found;
   }
}