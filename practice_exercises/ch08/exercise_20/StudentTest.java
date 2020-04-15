import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest
{
    private Student anonymous;
    
    @Before public void registerStudent()
    {
        anonymous = new Student(10);    // anonymous student
        double[] scores = { 8, 7, 8.5, 9.5, 7, 5, 10 };
        
        for (double score : scores)
        {
            // add student score
            anonymous.addScore(score);
        }   
    }
    
    @Test public void scoresSum()
    {
        double EPSILON = 1E-14;
        double expected = 55;
        Assert.assertEquals(expected, anonymous.sum(), EPSILON);
        
    }
    
    @Test public void minimumScore()
    {
        double EPSILON = 1E-14;
        double expected = 5;
        Assert.assertEquals(expected, anonymous.minimum(), EPSILON);
    }
    
    @Test public void aggregateScore()
    {
        double EPSILON = 1E-14;
        double expected = 50;
        Assert.assertEquals(expected, anonymous.finalScore(), EPSILON);
    }
}