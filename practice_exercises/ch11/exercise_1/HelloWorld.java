import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program writes and reads a greeting to and from a file
*/
public class HelloWorld
{
   public static void main(String[] args) throws FileNotFoundException
   {
      PrintWriter out = new PrintWriter("hello.txt");
      out.println("Hello, World!");
      out.close();
      
      File inputFile = new File("hello.txt");
      Scanner in = new Scanner(inputFile);
      String greeting = in.nextLine();
      
      System.out.println(greeting);
      
   }
}