/**
        A unit-test class to show that the student class works as expected
*/
public class StudentTester
{
        public static void main(String[] args)
        {
              Student female = new Student("Elizabeth");
        
                System.out.print("actual name: ");
                System.out.println(female.getName());
                System.out.println("expected: Elizabeth");
                
                
                female.addQuiz(50);
                female.addQuiz(20);
                female.addQuiz(45);    // Elizabeth has a total quiz score of 115
                
                System.out.print("actual total quiz score: ");
                System.out.println(female.getTotalScore());
                System.out.println("expected: 115");
                
                System.out.print("average: ");
                System.out.println(female.getAverageScore());
                System.out.print("expected: 38.33");  
        }
         
}