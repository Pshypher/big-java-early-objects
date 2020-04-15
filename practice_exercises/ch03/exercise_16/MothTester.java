/**
        A unit-test class for the Moth class
*/
public class MothTester
{
        public static void main(String[] args)
        {
                // Construct a Moth object
                Moth femaleMoth = new Moth(20);
                femaleMoth.moveToLight(45);     // The moth is now at 32.5 px from the fixed origin
                
                System.out.print("actual: ");
                System.out.println(femaleMoth.getPosition());
                System.out.println("expected: 32.5");
        }
}