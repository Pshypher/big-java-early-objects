import java.util.Scanner;

/**
   This class solves the eight queens problem using backtracking.
*/
public class NQueens
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter N: ");
      int n = console.nextInt();
      solve(new NQueensPartialSolution(0, n));
   }

   /**
      Prints all solutions to the problem that can be extended from 
      a given partial solution.
      @param sol the partial solution
   */
   public static void solve(PartialSolution sol)
   {
      int exam = sol.examine();
      if (exam == PartialSolution.ACCEPT) 
      { 
         System.out.println(sol); 
      }
      else if (exam == PartialSolution.CONTINUE)
      {
         for (PartialSolution p : sol.extend())
         {
            solve(p);
         }
      }
   }
}

