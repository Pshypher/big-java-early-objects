import java.util.Scanner;

/**
   This program teaches arithmetic to a young child
*/
public class ArithmeticTutor
{
   public static void main(String[] args)
   {
      final int MAX_ATTEMPTS = 2;
      final int LIMIT = 15;
      final int MIN_PTS = 5;
      
      Scanner console = new Scanner(System.in);
      boolean done = false;
      
      
      int score = 0;
      int attempts = 0;
      ArithmeticQuiz quiz = new ArithmeticQuiz();
      
      while (attempts < MAX_ATTEMPTS && score < LIMIT)
      {   
         System.out.print(quiz.format());
         int response = console.nextInt();
         if (!quiz.checkAnswer(response))
         {
            System.out.println("Wrong!");
            attempts++;
         }
         else
         {
            score++;
            attempts = 0;
            quiz.nextQuestion();
         }
         
         if (Math.floorMod(score, MIN_PTS) == 0 && attempts == 0) 
         {
            quiz.nextLevel();
         }
      }
      
      System.out.printf("%d correct response(s) of %d", score, LIMIT);
   }
}