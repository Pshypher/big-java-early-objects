import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program reads a file and writes each line from that
   file preceeded with a number to an output file.
*/
public class FileFormatter
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();
      
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter out = new PrintWriter(outputFileName);
      
      int lineNumber = 1;
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         out.println("/*" + lineNumber + "*/ " + line);
         lineNumber++;
      }
      
      in.close();
      out.close();
   }
}