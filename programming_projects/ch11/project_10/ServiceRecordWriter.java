import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program calculates the total sum for each recorded
   hotel service
*/
public class ServiceRecordWriter
{
   public static void main(String[] args)
   {
      boolean done = false;
      while (!done)
      {
         try
         {
            System.out.print("File name: ");
            Scanner console = new Scanner(System.in);
            String filename = console.next();
            
            Scanner in = new Scanner(new File(filename));
            
            SalesRecord records = new SalesRecord();
            records.read(in);
            records.write();
            in.close();
            
            done = true;  
         }
         catch (IOException exception)
         {
            System.out.println(exception.getMessage());  
         }
      }
   }
}