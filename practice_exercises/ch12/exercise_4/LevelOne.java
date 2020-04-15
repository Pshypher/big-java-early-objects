import java.util.Random;

public class LevelOne extends Level
{
   public void next()
   {
      final int LIMIT = 10;
      
      Random generator = new Random();
      
      int m = generator.nextInt(LIMIT);
      int n = generator.nextInt(LIMIT - m);
      
      setOperand1(m);
      setOperand2(n);
   }
   
   
}