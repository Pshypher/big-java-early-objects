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
        Appends a text to the entire text of this question.
        @param text one of the text this question is comprised of
    */
    public void addText(String text)   
    {
        this.text = this.text + text + "\n";
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
        return response.equals(answer);
    }

    /**
        Displays this question.
    */
    public void display()
    {
        text = text.trim();
        System.out.println(text);
    }
}
