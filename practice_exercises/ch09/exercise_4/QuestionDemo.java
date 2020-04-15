import java.util.Scanner;
import static java.lang.Math.*;

/**
    This program tests the NumericQuestion class.
*/
public class QuestionDemo
{
    public static void main(String[] args)
    {
        NumericQuestion first = new NumericQuestion(0.01);
        first.setText("What is the approximate value of PI?");
        first.setAnswer(PI);
        
        NumericQuestion second = new NumericQuestion(0.01);
        second.setText("What is the square root of 2?");
        second.setAnswer(sqrt(2));
        
        printQuestion(first);
        printQuestion(second);
    }
    
    public static void printQuestion(NumericQuestion q)
    {
        q.display();
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println(q.checkAnswer(number));
    }
}