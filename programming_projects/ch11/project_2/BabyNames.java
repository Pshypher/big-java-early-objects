import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static int SIZE = 1000;
   
   public static void main(String[] args) throws FileNotFoundException
   {  
      try (Scanner in = new Scanner(new File("babynames.txt")))
      {
         NamesSet boys = new NamesSet(SIZE);
         NamesSet girls = new NamesSet(SIZE);
      
         while (in.hasNext())
         {
            int rank = in.nextInt();
            boys.process(in);
            girls.process(in);              
         }
         
         // names that appear in both records 
         boys.intersection(girls);
      }
   }
}	
