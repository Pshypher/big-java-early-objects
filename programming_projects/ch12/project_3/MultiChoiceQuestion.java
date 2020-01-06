/**
   A multi-choice question is a choice question with at 
   least 2 or more correct answers.
*/
public class MultiChoiceQuestion extends ChoiceQuestion
{
   private String answer;
   private int choiceSize;
   
   /**
      Constructs a multiple choice question with no
      set answer and choices
   */
   public MultiChoiceQuestion()
   {
      answer = "";
      choiceSize = 0;
   }
   
   public void addChoice(String choice, boolean correct)
   {
      super.addChoice(choice, correct);
      choiceSize++;
      if (correct) { answer = answer + choiceSize; }
   }
   
   public boolean checkAnswer(String response)
   {
      response = trim(response);
      response = removeDuplicateCharacters(response);
      
      if (response.length() != answer.length()) { 
         return false; }
         
      boolean found = true;
      for (int i = 0; i < answer.length() && found; i++)
      {
         if (response.indexOf(answer.charAt(i)) < 0)
         {
            found = false;
         }
      }
      
      return found;
   }
   
   /**
      Removes all whitespaces from a given string
      @param s the string containing whitespaces
      @return a string with no whitespace
   */
   private String trim(String s)
   {
      int i = 0;
      while (i < s.length())
      {
         if (Character.isWhitespace(s.charAt(i)))
         {
            s = s.substring(0, i) + s.substring(i + 1);
         }
         else
         {
            i++;
         }
      }
      
      return s;
   }
   
   /**
      Removes duplicate characters from a given string
      @param s the string to be processed 
      @return a string with no duplicate chars
   */
   private String removeDuplicateCharacters(String s)
   {
      int i = 0;
      while (i < s.length())
      {
         int ch = (int) s.charAt(i);
         if (s.substring(0, i).indexOf(ch) >= 0)
         {
            s = s.substring(0, i) + s.substring(i + 1);
         }
         else
         {
            i++;
         }
      }
      
      return s;
   }
}