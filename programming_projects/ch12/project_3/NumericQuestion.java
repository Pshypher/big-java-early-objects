/**
   A numeric question accepts responses that are approximately
   the same as the answer 
*/
public class NumericQuestion extends Question
{
   private static final double EPSILON = 1E-3;
   
   private double answer;
   
   public void setAnswer(String correctResponse)
   {
      answer = Double.parseDouble(correctResponse.trim());
   }
   
   public boolean checkAnswer(String response)
   {
      double value = Double.parseDouble(response.trim());
      return Math.abs(answer - value) <= EPSILON;
   }
}