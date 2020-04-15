import java.util.Scanner;

/**
        This program uses an instance the Grade class to
        display the numeric value for each grade
*/
public class GradeTester
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
        
                System.out.print("Enter a letter grade: ");
                String gradeSymbol = in.next();
                
                Grade grade = new Grade();
                double value = grade.getNumericGrade(gradeSymbol);
                
                String out = (value < 0) ? "Error: No grade \"" + gradeSymbol + "\""
                        : "The numeric value is " + value;
                System.out.println(out);                                        
        }
}