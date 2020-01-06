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
        String responseWithoutSpaces = removeWhitespaces(response);
        String answerWithoutSpaces = removeWhitespaces(answer);
        return responseWithoutSpaces.equalsIgnoreCase(answerWithoutSpaces);
    }
    
    /**
        Removes all whitespaces from a text.
        @param s sequence of characters to be stripped of spaces.
        @return sequence of characters without spaces.
    */
    public String removeWhitespaces(String s)
    {
        String textWithoutWhitespaces = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetter(ch))
            {
                textWithoutWhitespaces = textWithoutWhitespaces + ch;
            } 
        }
        
        return textWithoutWhitespaces;
    }
    
    /**
        Displays this question.
   */
    public void display()
    {
        System.out.println(text);
    }
}
