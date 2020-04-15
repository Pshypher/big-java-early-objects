public class ResultPublisher
{
    public static void main(String[] args)
    {
        Student john = new Student("John Doe", 7);
        Student jane = new Student("Jane Doe", 5);
        
        double[] johnsScores = { 8, 7, 8.5, 9.5, 7, 5, 10 };
        double[] janesScores = { 5, 7.5, 10, 9.5, 9.25 };
        
        fillScores(john, johnsScores);
        fillScores(jane, janesScores);
        
        GradeBook book = new GradeBook();
        
        book.addStudent(john);
        book.addStudent(jane);
        
        System.out.print(book);
    }
    
    public static void fillScores(Student aStudent, double[] scores)
    {
        for (double score : scores)
        {
            aStudent.addScore(score);
        }
    }
} 