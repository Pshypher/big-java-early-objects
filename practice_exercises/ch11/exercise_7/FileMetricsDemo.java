import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMetricsDemo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      
      int lineCount = 0;
      int characterCount = 0;
      int wordCount = 0;
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         lineCount++;
         
         for (int i = 0; i < line.length(); i++)
         {
            char ch = line.charAt(i);
            if (!Character.isWhitespace(ch)) 
            {
               characterCount++;
            }
         }
         
         Scanner lineScanner = new Scanner(line);
         while (lineScanner.hasNext())
         {
            lineScanner.next();
            wordCount++;
         }
      }
      
      System.out.println("Lines: " + lineCount);
      System.out.println("Words: " + wordCount);
      System.out.println("Characters: " + characterCount);
   }
}