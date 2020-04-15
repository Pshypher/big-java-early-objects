/**
        A unit-test for the Bug class
*/
public class BugTester
{
        public static void main(String[] args)
        {
                // Construct an object of type Bug
                Bug bugsy = new Bug(10);
                bugsy.move();   // Now the position is 11
                bugsy.turn();
                bugsy.move();   // Now the position is 10
                
                System.out.print("Actual: ");
                System.out.println(bugsy.getPosition());
                System.out.println("Expected: 10");
                
                bugsy.turn();   
                bugsy.move();   // The position is 9
                bugsy.turn();
                bugsy.turn();
                bugsy.move();   // Now the position is 6
                
                System.out.print("Actual: ");
                System.out.println(bugsy.getPosition());
                System.out.println("Expected: 6");
        }
}