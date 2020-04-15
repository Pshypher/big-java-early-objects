/**
    A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
    private int subscript;

    /**
        Constructs a choice question with no choices.
    */
    public ChoiceQuestion()
    {
        subscript = 0;
    }

    /**
        Adds an answer choice to this question.
        @param choice the choice to add
        @param correct true if this is the correct choice, false otherwise
    */
    public void addChoice(String choice, boolean correct)
    {
        subscript++;
        String text = subscript + ": " + choice;
        addText(text);
        if (correct) 
        {
            // Convert subscript to string
            String choiceString = "" + subscript;
            setAnswer(choiceString);
        }
    }
}

