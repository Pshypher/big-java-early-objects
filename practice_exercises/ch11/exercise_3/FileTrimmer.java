import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
         lines.add(in.nextLine());
      }
      
      in.close();
      
      PrintWriter out = new PrintWriter(filename);
      
      int i = 0;
      while (lines.get(i).equals("")) { i++; }
      
      int j = lines.size() - 1;
      while (lines.get(j).equals("")) { j--; }
      
      for (int pos = i; pos <= j; pos++)
      {
         out.println(lines.get(pos));
      }
      
      out.close();
   }
}