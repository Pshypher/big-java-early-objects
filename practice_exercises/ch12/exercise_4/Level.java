/**
   Describes the difficulty level of an arithmetic problem
*/
public abstract class Level
{

   private int operand1;
   private int operand2;

   /**
      Generates one-digit operands for an arithmetic operation.
   */
   public abstract void next();

   /**
      Set the value of the operand to the left of the arithmetic symbol.
      @param n one-digit value between 0 and 9 (inclusive)
   */
   protected void setOperand1(int n)
   {
      operand1 = n;
   }
   
   /**
      Get the value of the operand to the right of the arithmetic symbol.
      @param n one-digit value between 0 and 9 (inclusive)
   */
   protected void setOperand2(int n)
   {
      operand2 = n;
   }
   
   /**
      Get the operand to the left of the arithmetic operator.
      @return value of one of the operands
   */
   public int getOperand1()
   {
      return operand1;
   }
   
   /**
      Get the operand to the right of the arithmetic operator.
      @return value of the other operand
   */
   public int getOperand2()
   {
      return operand2;
   } 
   
   /**
      Get the arithmetic operator used in this level.
      @return the arithmetic operator
   */
   public String getOperator()
   {
      return "+";
   }
}