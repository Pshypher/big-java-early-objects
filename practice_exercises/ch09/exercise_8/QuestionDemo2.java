import java.util.Scanner;

/**
    This program shows a simple quiz with two choice questions and
    a multi-choice question.
*/
public class QuestionDemo2
{
    public static void main(String[] args)
    {
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);
        
        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        
        MultiChoiceQuestion third = new MultiChoiceQuestion();
        third.setInstructionText("Provide all correct choices seperated by spaces");
        third.setText("Which of these language(s) are statically typed?");
        third.addChoice("Ruby", false);
        third.addChoice("C++", true);
        third.addChoice("Python", false);
        third.addChoice("Java", true);
        
        presentQuestion(first);
        presentQuestion(second);
        presentQuestion(third);
    }

    /**
        Presents a question to the user and checks the response.
        @param q the question
    */
    public static void presentQuestion(ChoiceQuestion q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}

