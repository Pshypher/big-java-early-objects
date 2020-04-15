package ch10.exercise_2;

/**
    This class tests the Quiz class
*/
public class MeasurableTester
{
    public static void main(String[] args)
    {
        Measurable[] quizzes = new Measurable[3];
        quizzes[0] = new Quiz(34);
        quizzes[1] = new Quiz(86);
        quizzes[2] = new Quiz(72);
        
        double averageScore = Data.average(quizzes);
        System.out.println("Average score: " + averageScore);
        System.out.println("Expected: 64.0");
        
        Measurable meas = Data.max(quizzes);
        Quiz quiz = (Quiz) meas;
        double highest = quiz.getScore();
        System.out.println("Highest score: " + highest);
        System.out.println("Expected: 86.0");
        
        String grade = quiz.getGrade();
        System.out.println("Grade: " + grade);
        System.out.println("Expected: A");
    }
}