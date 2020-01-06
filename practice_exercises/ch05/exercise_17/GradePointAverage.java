import java.util.Scanner;

/**
        This program uses an instance the Grade class to display
        the grade for the average score of a student.
*/
public class GradePointAverage
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
        
                System.out.print("Enter an average score: ");
                double average = in.nextDouble();
        
                Grade grade = new Grade();
                String symbol = grade.getNumericGrade(average);
                
                String out = (symbol.length() > 0) ? symbol :
                        "Error: Average scores are from 0.0-4.0";
                System.out.println(out);                                        
        }
}