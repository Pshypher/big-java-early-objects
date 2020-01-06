/**
   This program tests the replace method of the 
   String class
*/
public class ReplaceTester
{
   public static void main(String[] args)
   { 
      String river = "Mississippi";
      
      // Encode the i and s chars in river
      river = river.replace("i", "!");
      river = river.replace("s", "$");
      
      // Print the actual and expected results of the encoding
      System.out.println("actual: " + river);
      System.out.println("expected: " + "M!$$!$$!pp!");
   }
}
