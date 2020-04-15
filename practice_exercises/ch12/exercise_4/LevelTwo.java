import java.util.Random;

public class LevelTwo extends Level
{
   public void next()
   {
      final int LIMIT = 10;
      
      Random generator = new Random();
      setOperand1(generator.nextInt(LIMIT));
      setOperand2(generator.nextInt(LIMIT));
   }
}