import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion
{
    private String instruction;
    private String answers;
    private int choiceNumber;
    
    /**
        Instruction for this question type provided to the user.
        @param anInstruction text of the instruction
    */
    public void setInstruction(String anInstruction)
    {
        instruction = anInstruction;
        answers = "";
        choiceNumber = 0;
    }
    
    public void addChoice(String choice, boolean correct)
    {
        choiceNumber++;
        super.addChoice(choice, correct);
        if (correct) 
        {
            String choiceString = choiceNumber + " ";
            answers = answers + choiceNumber;
        }
    }
         
    public boolean checkAnswer(String response)
    {
        boolean correct = false;
        int i = 0;
        while (!correct && i < answers.length())
        {
            char ch = answers.charAt(i);
            if (!Character.isWhitespace(ch) && 
                response.equals(answers.substring(i, i + 1)))
            { 
                correct = true;
            }
            i++;
        }
        
        return correct;
    }
    
    public void display()
    {
        // Display the instruction for this question
        System.out.println(instruction);
        // Display the question text and the answer choices
        super.display();
    } 
}