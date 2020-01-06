import java.util.ArrayList;
import java.util.Scanner;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }
   
   public String format()
   {
      // Format the question text
      String r = super.format();
      // Format the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         r = r + "\n" + choiceNumber + ": " + choices.get(i);
      }
      
      return r;
   }
   
   public void read(Scanner in)
   {
      String text = in.nextLine();
      setText(text);
      
      String line = in.nextLine();
      while (!line.equals(""))
      {
         Scanner lineScanner = new Scanner(line);
         String correct = lineScanner.next();
         String choice = lineScanner.next();
         if (correct.equals("+"))
         {
            addChoice(choice, true);
         }
         else
         {
            addChoice(choice, false);
         }
         
         line = in.nextLine();
      }
   }  
}

