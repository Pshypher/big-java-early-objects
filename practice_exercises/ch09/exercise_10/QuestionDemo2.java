import java.util.Scanner;

/**
    This program shows a simple quiz with two choice questions.
*/
public class QuestionDemo2
{
    public static void main(String[] args)
    {
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");
        
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        
        System.out.println(first);
        System.out.println(second);
    }
}

