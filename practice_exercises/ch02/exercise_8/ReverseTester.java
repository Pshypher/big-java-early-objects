/**
   @author ehost
*/
public class ReverseTester
{
   public static void main(String[] args)
   {
      // Constructs a StringBuilder object and stores in an str variable
      StringBuilder str = new StringBuilder("desserts");
      StringBuilder reversedStringBuilder = str.reverse();
      String reversedString = reversedStringBuilder.toString();
      
      System.out.print("reversedString: ");
      System.out.println(reversedString);
      System.out.print("Expected: ");
      System.out.println("stressed");
   }
}
