public class SquareRoot
{
   public static void main(String[] args)
   {
      double value1 = 2;
      System.out.println("Square root of " + value1 + ": " 
         + squareRoot(value1));
      System.out.println("Expected: " + Math.sqrt(value1));
      double value2 = 49;
      System.out.println("Square root of " + value2 + ": " 
         + squareRoot(value2));
      System.out.println("Expected: 7");         
   }
   
   /**
      Calculates the square root for a given nonnegative number.
      @param x the number whose root is calculated
      @return the square root of x
   */
   public static double squareRoot(double x)
   {
      double g = x / 2;
      return squareRootGuess(x, g);
   }
   
   /**
      Computes the approximate value of the square root of a nonnegative
      number using a guess that becomes closer to the actual value at each
      step.
      @param x the number whose square root is computed
      @param g a guess for the square root of the number x
      @return the square root of x
   */
   public static double squareRootGuess(double x, double g)
   {
      final double EPSILON = 1E-14;
      
      if (Math.abs(g * g - x) <= EPSILON) { 
         return g; }
      else
      {
         double betterGuess = (g + x / g) / 2;
         return squareRootGuess(x, betterGuess);
      }
   }
}