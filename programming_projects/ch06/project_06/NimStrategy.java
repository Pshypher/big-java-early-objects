import java.util.Random;

public class NimStrategy
{  
   /**
      Executes a move based on the size of the pile and
      the strategy of this computer
      @param mode either smart (0) or random (1)
      @param pile the pile of marbles
   */
   public static void move(int mode, NimPile pile)
   {
      int quantity;
      int n = pile.getPileSize();
      if (mode == 0) { quantity = strategicMove(n); }
      else { quantity = randomMove(n); }
      pile.remove(quantity);
   }
   
   /**
      Takes of enough marbles to make the size of the pile
      a power of 2 minus 1.
      @param size of the pile
      @return quantity of marbles removed
   */
   public static int strategicMove(int n)
   {
      if (n == 2) { return 1; }
      
      int base = 2;
      int exponent = (int) Math.round(
            Math.log10(n) / Math.log10(base)); 
      double value = Math.pow(base, exponent) - 1;
      int amount;
      if (n != value)
      {
         exponent--;
         amount = (int) Math.pow(base, exponent) - 1;
      }
      else
      {
         amount = randomMove(n);
      }
      
      return amount;
   }
   
   /**
      Takes a random amount of marbles between 1 and n/2,
      @param n size of the pile
      @return quantity of marbles removed.
   */
   public static int randomMove(int n)
   {
      Random generator = new Random();
      int amount = (n > 2) ? generator.nextInt(n / 2) + 1 : 1;
      return amount;
   }
}