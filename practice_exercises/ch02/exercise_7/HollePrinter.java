/**
   @author ehost
*/
public class HollePrinter 
{
   public static void main(String[] args)
   {
      String greeting = "Hello, World!";
      System.out.print("greeting: ");
      System.out.println(greeting);
      
      String firstFourChars = "Hell";
      String remainingChars = "o, World!";
      
      System.out.print("firstFourChars.replace(\"e\", \"o\"): ");
      System.out.println(firstFourChars.replace("e", "o"));
      System.out.print("remainingChars.replace(\"o\", \"e\"): ");
      System.out.println(remainingChars.replace("o", "e"));
      
      System.out.print(firstFourChars.replace("e", "o"));
      System.out.println(remainingChars.replace("o", "e"));
   }
}
