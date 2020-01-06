import java.util.Random;

/**
   @author ehost
 */
public class DieSimulator
{
   public static void main(String[] args)
   {
      Random generator = new Random();
      System.out.println(generator.nextInt(6) + 1);
   }
}
