import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   This program administers a quiz and grades user responses.
*/
public class QuizDemo
{
   public static void main(String[] args)
   {
      Quiz quiz = new Quiz();
      try
      {
         quiz.readFile("quiz.txt");
      }
      catch (FileNotFoundException exception)
      {
         System.out.println("Error could not open file.");
         return;
      }
      
      Scanner console = new Scanner(System.in);
      while (quiz.hasNextQuestion())
      {
         Question q = quiz.nextQuestion();
         System.out.println(q.format());
         String response = console.nextLine();
         System.out.println(q.checkAnswer(response));
      }
   }
}