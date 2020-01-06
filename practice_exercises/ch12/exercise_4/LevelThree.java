import java.util.Random;

public class LevelThree extends Level
{
   public void next()
   {
      final int LIMIT = 10;
      
      Random generator = new Random();
      int m = generator.nextInt(LIMIT);
      int n = generator.nextInt(LIMIT);
      
      if (m > n)
      {
         setOperand1(m);
         setOperand2(n);
      }
      else
      {
         setOperand1(n);
         setOperand2(m);
      }     
   }
   
   public String getOperator()
   {
      return "-";
   }
}