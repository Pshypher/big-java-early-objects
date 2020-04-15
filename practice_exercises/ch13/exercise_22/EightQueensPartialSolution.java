import java.util.Arrays;

/**
   A partial solution to the eight queens puzzle.
*/
public class EightQueensPartialSolution implements PartialSolution
{
   private Queen[] queens;
   private static final int NQUEENS = 8;
   
   /**
      Constructs a partial solution of a given size.
      @param size the size
   */
   public EightQueensPartialSolution(int size)
   {
      queens = new Queen[size];
   }

   public int examine()
   {
      for (int i = 0; i < queens.length; i++)
      {
         for (int j = i + 1; j < queens.length; j++)
         {
            if (queens[i].attacks(queens[j])) { 
               return ABANDON; }
         }
      }
      if (queens.length == NQUEENS) { 
         return ACCEPT; }
      else { 
         return CONTINUE; }
   }

   public PartialSolution[] extend()
   {
      // Generate a new solution for each column
      EightQueensPartialSolution[] result = 
         new EightQueensPartialSolution[NQUEENS];
      for (int i = 0; i < result.length; i++)
      {
         int size = queens.length;
      
         // The new solution has one more row than this one
         result[i] = new EightQueensPartialSolution(size + 1);
      
         // Copy this solution into the new one
         for (int j = 0; j < size; j++)
         {
            result[i].queens[j] = queens[j];
         }
      
         // Append the new queen into the ith column
         result[i].queens[size] = new Queen(size, i);
      }
      return result;
   }

   public String toString() { 
      return Arrays.toString(queens); }
}

