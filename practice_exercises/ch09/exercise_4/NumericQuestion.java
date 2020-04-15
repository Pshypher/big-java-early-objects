/**
    The following class checks that a numeric response
    is a good estimate of the actual answer. 
*/
public class NumericQuestion extends Question
{
    private double answer;
    private double tolerance;
    
    /**
        Construct a numeric question with the specified tolerance.
        @param tolerance value by which the response should differ by at most
    */
    public NumericQuestion(double tolerance)
    {
        this.tolerance = tolerance;
    }
    
    /**
        Sets the answer to this numeric question.
        @param numericAnswer the answer
    */
    public void setAnswer(double numericAnswer)
    {
        answer = numericAnswer;
    }
    
    /**
        Compares the response and the actual answer which should'nt differ by
        at most the tolerance of this numeric question.
        @param number numeric value given by respondent.
        @return true if response is approximately close to the answer
        otherwise false
    */
    public boolean checkAnswer(double number)
    {
        return Math.abs(answer - number) <= tolerance;
    }
}