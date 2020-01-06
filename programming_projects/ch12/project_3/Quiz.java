import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   A quiz contains a list of questions.
*/
public class Quiz
{
   private ArrayList<Question> questions;
   private int currentQuestion;
   
   /**
      Constructs a quiz with no questions.
   */
   public Quiz()
   {
      questions = new ArrayList<Question>();
      currentQuestion = 0;
   }

   /**
      Adds a question to this quiz.
      @param q the question
   */
   public void addQuestion(Question q)
   {
      questions.add(q);
   }

   /**
      Generates the next question.
      @return the next question
   */
   public Question nextQuestion()
   {
      Question q = questions.get(currentQuestion);
      currentQuestion++;
      return q;
   }
   
   /**
      Checks whether there is still an unpresented question 
      in this quiz
      @return true if there is still a question yet to be presented,
      false otherwise
   */
   public boolean hasNextQuestion()
   {
      return currentQuestion < questions.size(); 
   }
   
   /**
      Reads the details of a quiz from a text file, adding each
      question to this quiz
      @param filename the name of the file
   */
   public void readFile(String filename) throws FileNotFoundException
   {
      try (Scanner in = new Scanner(new File(filename)))
      {
         while (in.hasNextLine())
         {
            String type = in.nextLine().trim();
            Question q;
            switch (type)
            {
               case "M":
                  q = new MultiChoiceQuestion();
                  break;
               case "N":
                  q = new NumericQuestion();
                  break;
               case "S":
                  q = new ChoiceQuestion();
                  break;
               default:
                  q = new Question();
            }
            q.read(in);
            questions.add(q);
         }
      }
   }
}

