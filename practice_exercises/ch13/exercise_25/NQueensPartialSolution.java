import java.util.Arrays;

/**
   A partial solution to the n queens puzzle.
*/
public class NQueensPartialSolution implements PartialSolution
{
   private Queen[] queens;
   private int numberOfQueens;
   
   /**
      Constructs a partial solution of a given size.
      @param size the size
      @param n the number of queens needed to solve this problem
   */
   public NQueensPartialSolution(int size, int n)
   {
      queens = new Queen[size];
      numberOfQueens = n;
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
      if (queens.length == numberOfQueens) { 
         return ACCEPT; }
      else { 
         return CONTINUE; }
   }

   public PartialSolution[] extend()
   {
      // Generate a new solution for each column
      NQueensPartialSolution[] result = 
         new NQueensPartialSolution[numberOfQueens];
      for (int i = 0; i < result.length; i++)
      {
         int size = queens.length;
      
         // The new solution has one more row than this one
         result[i] = new NQueensPartialSolution(size + 1, numberOfQueens);
      
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

