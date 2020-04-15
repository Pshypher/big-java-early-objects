import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
   This program reads each line in a file, reverse its lines
   and writes them to another file.
*/
public class Reverse
{
   public static void main(String[] args) throws FileNotFoundException
   {
      if (args.length != 2)
      {
         System.out.println("Usage: java Reverse infile outfile");
         return;
      }
      
      Scanner in = new Scanner(new File(args[0]));
      PrintWriter out = new PrintWriter(args[1]);
      
      final int CAPACITY = 10;
      String[] lines = new String[CAPACITY];
      int linesSize = 0;
      
      while (in.hasNextLine())
      {
         if (linesSize >= lines.length)
         {
            lines = Arrays.copyOf(lines, lines.length * 2);
         }
         lines[linesSize] = in.nextLine();
         linesSize++;
      }
      
      reverse(lines, linesSize);
      for (int i = 0; i < linesSize; i++)
      {
         out.println(lines[i]);
      }
      
      in.close();
      out.close();
   }
   
   /**
      Reverses the contents of an array in place
      @param s an array of strings
      @param size length of the array
   */
   public static void reverse(String[] s, int size)
   {
      int j = size - 1;
      for (int i = 0; i < size / 2; i++)
      {
         String temp = s[i];
         s[i] = s[j];
         s[j] = temp;
         j--;
      }
      
   }
}