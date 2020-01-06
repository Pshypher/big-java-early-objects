package ch10.exercise_2;


/**
    A quiz is graded using the score
*/
public class Quiz implements Measurable
{
    private int score;
    
    /**
        Construct a quiz with the specified score.
        @param quizScore the score
    */
    public Quiz(int quizScore)
    {
        score = quizScore;
    }
    
    /**
        Default constructor for a quiz with no score.
    */
    public Quiz()
    {
        this(0);
    }
    
   
    
    /**
        Sets the score for this quiz
        @param quizScore the score
    */
    public void setScore(int quizScore)
    {
        score = quizScore;
    }
    
    /**
        Get the score of this quiz
        @return the score 
    */
    public double getScore()
    {
        return score;
    }
    
    /**
        Compute the letter grade of this quiz.
        @return the grade
    */
    public String getGrade()
    {
        String grade;
        if (score > 89)
        {
            grade = "A+";
        }
        else if (score > 79)
        {
            grade = "A";
        }
        else if (score > 74)
        {
            grade = "B+";
        }
        else if (score > 69)
        {
            grade = "B";
        }
        else if (score > 59)
        {
            grade = "C";
        }
        else
        {
            grade = "F";
        }
        
        return grade;
    }
    
    public double getMeasure()
    {
        return score;
    }
}