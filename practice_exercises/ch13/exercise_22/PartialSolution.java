/**
   Describes a partial solution to a problem constrained
   by certain rules.
*/
public interface PartialSolution
{
   final int ACCEPT = 1;
   final int ABANDON = 2;
   final int CONTINUE = 3;
   
   /**
      Examines a partial solution.
      @return one of ACCEPT, ABANDON, CONTINUE
   */
   int examine();
   
   /**
      Yields all extensions of this partial solution.
      @return an array of partial solutions that extend this solution.
   */
   PartialSolution[] extend();
   
}