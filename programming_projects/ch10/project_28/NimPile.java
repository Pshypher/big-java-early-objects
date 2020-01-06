public class NimPile
{
   private int size;
   
   /**
      Constructs a pile of marbles in this game of nim 
      with the given pile size.
      @param pileSize initial size of the pile
   */
   public NimPile(int pileSize)
   {
      size = pileSize; 
   }
   
   /**
      Gets the current size of the pile.
   */
   public int getPileSize()
   {
      return size;
   }
   
   /**
      Removes the given number of marbles from the pile
      @param amount the marbles removed from the pile 
   */
   public void remove(int amount)
   {
      size = size - amount;
   }
}