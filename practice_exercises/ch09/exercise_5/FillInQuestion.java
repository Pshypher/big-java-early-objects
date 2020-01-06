public class FillInQuestion extends Question
{
    private String text;
    private String underline;
    
    /**
        Construct a fill in the gap question with an empty
        question and answer.
    */
    public FillInQuestion()
    {
        text = "";
        underline = "";
    }
    
    /**
        Sets the question using the given text.
        @param questionText the question
    */
    public void setText(String questionText)
    {
        
        int j = questionText.length() - 1;
        while (questionText.charAt(j) == '_')
        {
            underline = questionText.substring(j, j + 1) + underline;
            j--;
        }
        
        // remove the underscores
        text = questionText.substring(0, j + 1);
    }
    
    /**
        Display this question using a fill in the gap style.
    */
    public void display()
    {
        System.out.print(text);
        System.out.println(underline);
    }
    
    /**
        Checks that the response is the same  as the answer and displays
        the question and user response to this fill in the gap question.
        @param response user's response to this question
        @return true if the response is the same as the anwser, otherwise
        false
    */
    public boolean checkAnswer(String response)
    {
        System.out.printf("%s_%s_", text, response);
        System.out.println();
        return super.checkAnswer(response);
    }
}