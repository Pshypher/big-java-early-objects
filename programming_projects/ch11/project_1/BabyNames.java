import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static void main(String[] args) throws FileNotFoundException
   {  
      try (Scanner in = new Scanner(new File("babynames.txt")))
      {
         RecordWriter boys = new RecordWriter("boynames.txt");
         RecordWriter girls = new RecordWriter("girlnames.txt");
      
         while (in.hasNext())
         {
            int rank = in.nextInt();
            boys.write(rank, in);
            girls.write(rank, in);
         }
         
         boys.close();
         girls.close();
      }
   }
}	
