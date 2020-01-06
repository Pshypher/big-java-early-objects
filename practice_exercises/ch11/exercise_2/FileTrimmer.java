import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program removes all the blank lines from a file.
*/
public class FileTrimmer
{
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<String> lines = new ArrayList<String>();
       
      Scanner console = new Scanner(System.in);
      System.out.print("File name: ");
      String filename = console.next();
      
      File inputFile = new File(filename);
      Scanner in = new Scanner(inputFile);
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         if (!line.equals(""))
         {
            lines.add(line);
         }
      }
      
      in.close();
      
      PrintWriter out = new PrintWriter(filename);
      for (int i = 0; i < lines.size(); i++)
      {
         out.println(lines.get(i));
      }
      
      out.close();
   }
}