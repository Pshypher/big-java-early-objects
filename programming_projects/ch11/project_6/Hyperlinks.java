import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program reads all data from a web page and prints all
   hyperlinks.
*/
public class Hyperlinks
{
   public static void main(String[] args)
   { 
      Scanner console = new Scanner(System.in);
      
      boolean done = false;
      while (!done)
      {     
         try
         {
            String address;
            if (args.length > 0)
            {
               address = args[0];
            }
            else
            {
               System.out.print("Web address: ");
               address = console.next();
            }
            
            WebPageCrawler crawler = new WebPageCrawler(address);
            done = true;
            ArrayList<String> urls = crawler.walk(new ArrayList<String>());
            
         }
         catch (IOException exception)
         {
            System.out.println(exception.getMessage());
         }
      } 
   }
}