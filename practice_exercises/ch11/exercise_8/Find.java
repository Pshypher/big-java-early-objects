import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Find
{
   public static void main(String[] args) throws FileNotFoundException
   {
      int fileCount = 0;
      
      for (int i = 0; i < args.length; i++)
      {
         String target = args[0];
         if (i > 0)
         {
            String filename = args[i];
            fileCount++;
            Scanner in = new Scanner(new File(filename));
            TextFinder finder = new TextFinder();
            while (in.hasNextLine())
            {
               String line = finder.readLine(in, target);
               if (line != null)
               {
                  System.out.print(filename + ": ");
                  System.out.println(line.trim());
               }
            }
            
            in.close();
         }
      }
      
      if (fileCount == 0)
      {
         System.out.println("Usage: java Find target file1 [file2, ...]");
      }
   }
}