import java.util.Arrays;
import java.util.Scanner;

public class StudentQuizzes
{   
    private static String[] studentNames;
    private static int studentsSize;
    private static double[][] quizScores;
    private static int scoresSize = 0;
    
    private static Scanner in;
    
    static 
    {
        studentsSize = 0;
        studentNames = new String[10];
        scoresSize = 0;
        quizScores = new double[10][];
        
        in = new Scanner(System.in);
    }   
    
    public static void main(String[] args)
    {
        fillStudentNames();
        fillStudentQuizScores();
        
        System.out.println();
        System.out.println("Student Names       Scores");   
        for (int i = 0; i < studentsSize; i++)
        {   
            double score = finalScore(i); 
            System.out.printf("%-20s%4.2f", studentNames[i], score);
            System.out.println();
        }
    }
    
    /**
        Add the names of students to an array of student names
    */
    public static void fillStudentNames()
    {
        String reply; 
        do
        {
            if (studentsSize >= studentNames.length)
            {
                studentNames = Arrays.copyOf(studentNames, 
                    studentNames.length * 2);
            }
            System.out.print("Enter name of student: ");
            studentNames[studentsSize] = in.next();
            studentsSize++;
            System.out.print("Add another student (y or n): ");
            reply = in.next();
        }
        while (reply.equalsIgnoreCase("y"));
    }
    
    /**
        Add the quiz score for each student to another array
        holding the quiz scores for each student
    */
    public static void fillStudentQuizScores()
    { 
        while (scoresSize < studentsSize)
        {
            if (scoresSize >= quizScores.length)
            {
                quizScores = Arrays.copyOf(quizScores, 
                    quizScores.length * 2);
            }
            quizScores[scoresSize] = new double[5];
            System.out.println("Enter " + studentNames[scoresSize] + 
                "'s quiz scores, Q to quit: " );
            int quizzesSize = 0;
            while (in.hasNextDouble())
            {   if (quizzesSize >= quizScores[scoresSize].length)
                {
                    quizScores[scoresSize] = Arrays.copyOf(
                        quizScores[scoresSize], 
                        quizScores[scoresSize].length * 2);
                }
                quizScores[scoresSize][quizzesSize] = in.nextDouble();  
                quizzesSize++;
            }
            quizScores[scoresSize] = Arrays.copyOf(quizScores[scoresSize],
                quizzesSize); 
            // Move the position of the Scanner object past the 
            // token not of the primitive data type double
            in.next();
            scoresSize++;
        }
    }
    
    /**
        Find the minimum quiz score of a student.
        @param n the index of a student's quiz scores within
        the array.
        @return the minimum score.
    */
    private static double minimum(int n)
    {   
        if (quizScores[n].length == 0) { return 0; }
        
        double smallest = quizScores[n][0];
        for (int i = 1; i < quizScores[n].length; i++)
        {
            if (quizScores[n][i] < smallest)
            {
                smallest = quizScores[n][i];
            }  
        }
        
        return smallest;
    }
    
    /**
        Calculate the sum of a student's quiz scores
        @param n the index of a student's quiz scores within
        the array.
        @return the sum of a student's quiz scores.
    */
    private static double sum(int n)
    {
        double total = 0;
        for (double score : quizScores[n])
        {
            total = total + score;
        }
        
        return total;
    }
    
    /**
        Calculate the sum of a student's quiz scores excluding
        the minimum score
        @param n index of the record for a student's quiz scores
        @return the final score
    */
    private static double finalScore(int n)
    {
        return sum(n) - minimum(n);
    } 
}