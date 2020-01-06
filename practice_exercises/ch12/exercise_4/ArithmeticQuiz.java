/**
   Describes arithmetic problems with answers to sums and 
   differences of numbers
*/
public class ArithmeticQuiz
{
   public static final Level EASY;
   public static final Level MEDIUM;
   public static final Level HARD;
   
   static
   {
      EASY = new LevelOne();
      MEDIUM = new LevelTwo();
      HARD = new LevelThree();
   }
   
   private Level difficulty;
   
   /**
      Constructs an arithmetic quiz set at level one
   */
   public ArithmeticQuiz()
   {
      difficulty = EASY;
      difficulty.next();
   }
   
   /**
      Generates the next arithmetic problem.
   */
   public void nextQuestion()
   {
      difficulty.next();
   }
   
   /**
      Generates formatted string of this problem based on the
      level of difficulty.
      @return formatted string of this arithmetic problem
   */
   public String format()
   {
      return String.format("%d %s %d = ", difficulty.getOperand1(),
         difficulty.getOperator(), difficulty.getOperand2());
   }
   
   /**
      Checks the user response against the actual answer.
      @param response the number entered by the user
      @return true if the response is the same as the answer, false otherwise
   */
   public boolean checkAnswer(int response)
   {
      int answer;
      int op1 = difficulty.getOperand1();
      int op2 = difficulty.getOperand2();
      
      if (difficulty == HARD)
      {  
         answer = op1 - op2;
      }
      else
      {
         answer = op1 + op2;
      }
      
      return  answer == response;
   }
   
   /**
      Increases the difficulty level of this arithmetic problem
   */
   public void nextLevel()
   {
      if (difficulty == EASY)
      {
         difficulty = MEDIUM;
      }
      else if (difficulty == MEDIUM)
      {
         difficulty = HARD;
      }
      
      nextQuestion();
   } 
}