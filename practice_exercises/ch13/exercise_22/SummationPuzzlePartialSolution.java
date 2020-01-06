import java.util.ArrayList;

/**
   A partial solution to a summation puzzle problem.
*/
public class SummationPuzzlePartialSolution implements PartialSolution
{
   private String operand1;
   private String operand2;
   private String answer;
   private int tokenPosition;
   private int answerIndex;
   private ArrayList<Alphabet> alphabets;
   
   /**
      Constructs a partial solution to a summation puzzle.
      @param a one of both words summed in this puzzle
      @param b the other word
      @param res the expected result 
   */
   public SummationPuzzlePartialSolution(String a, String b, String res)
   {
      operand1 = a;
      operand2 = b;
      answer = res;
      pos = operand1.length();
      next();
   }
   
   public void next()
   {
      pos--;
        
   }
   
   public int examine()
   { 
      int end = answer.length() - 1;
      if (index == end) { return ACCEPT; }
      else if (invalid()) { return ABANDON; }
      else { return continue; }
   }
   
   private boolean invalid()
   {}
   
   private boolean contains(char ch)
   {}
   
   public PartialSolution[] extend()
   {}   
}