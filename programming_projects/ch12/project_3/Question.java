import java.util.Scanner;

/**
   A question with a text and an answer.
*/
public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.trim().equalsIgnoreCase(answer);
   }

   /**
      Formats this question as a string.
      @return formatted string of this question
   */
   public String format()
   {
      return text;
   }
   
   /**
      Reads the details of this question from a given input stream.
      @param in the input stream
   */
   public void read(Scanner in)
   {
      setText(in.nextLine());
      setAnswer(in.nextLine());
   }
}
