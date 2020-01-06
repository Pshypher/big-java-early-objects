import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program reverses the order of characters on each line of a file.
*/
public class Reverse
{
   public static void main(String[] args) throws FileNotFoundException
   {  
      String inputFileName = "";
      if (args.length == 1) { inputFileName = args[0]; }
      else 
      {
         System.out.println("Usage: java Reverse infile");
         return;
      }       
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      
      ArrayList<String> lines = new ArrayList<String>();
      while (in.hasNextLine())
      {
         lines.add(in.nextLine());
      }
      
      in.close();
      
      PrintWriter out = new PrintWriter(inputFileName);
      for (int i = 0; i < lines.size(); i++)
      {
         String line = lines.get(i);
         String reverse = "";
         for (int j = 0; j < line.length(); j++)
         {
            reverse = line.charAt(j) + reverse;
         }
         out.println(reverse);
      }
      
      out.close();
   }
}