/**
    A multi-choice type has one or more correctChoices to a single question
*/
public class MultiChoiceQuestion extends ChoiceQuestion
{
    private String instructionText;
    private String correctChoices;
    private int choiceNumber;
    
    public MultiChoiceQuestion()
    {
        instructionText = "";
        correctChoices = "";
        choiceNumber = 0; 
    }
    
    /**
       Provide the instruction to this multi-choice question.
       @param text instruction of this question
    */
    public void setInstructionText(String text)
    {
        instructionText = text;
    }
    
    public void addChoice(String choice, boolean correct)
    {
        super.addChoice(choice, correct);
        choiceNumber++;
        if (correct)
        {
            correctChoices = correctChoices + String.format("%d ", choiceNumber); 
        }
    }
    
    public boolean checkAnswer(String response)
    {
        int i = 0;
        boolean correct = true;
        while (correct && i < correctChoices.length())
        {
            char ch = correctChoices.charAt(i);
            if (Character.isDigit(ch))
            {
                correct = contains(ch, response);
            }
            i++;
        }
        
        return correct;
    }
    
    /**
        Checks if the exact character appear within a string of text.
        @param c the character
        @param str the string of characters searched
        @return true if the exact character is found, false otherwise
    */
    private boolean contains(char c, String str)
    {
        int i = 0;
        boolean found = false;
        while (!found && i < str.length())
        {
            if (c == str.charAt(i))
            {
                found = true;
            }
            else
            {
                i++;
            }
        }
        
        return found;
    }
    
    public void display()
    {
        System.out.println(instructionText);
        super.display();
    }
}