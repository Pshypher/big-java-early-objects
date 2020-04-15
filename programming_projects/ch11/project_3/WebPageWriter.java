import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class WebPageWriter
{
   public static void main(String[] args) throws IOException
   {
      System.out.print("Web page address: ");
      Scanner console = new Scanner(System.in);
      String address = console.next();
      
      URL pageLocation = new URL(address);
      Scanner in = new Scanner(pageLocation.openStream());
      
      System.out.print("Save as: ");
      String filename = console.next();
      
      if (!filename.endsWith(".html")) 
      {
         filename = filename + ".html"; 
      }
      PrintWriter out = new PrintWriter(filename);
      
      while (in.hasNextLine())
      {
         out.println(in.nextLine());
      }
      
      in.close();
      out.close();
   }
}