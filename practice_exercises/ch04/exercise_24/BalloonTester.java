/**
        A unit-test for the Balloon class
*/
public class BalloonTester
{
        public static void main(String[] args)
        {
                // Construct a Balloon object
                Balloon balloon = new Balloon();
                
                balloon.addAir(100);    // Adds 100cm cube of air to the Balloon
                
                // Displays the volume of the balloon
                System.out.print("Actual: ");
                System.out.println(balloon.getVolume());
                System.out.println("Expected: 100");
                
                // Displays the surface area of the balloon
               System.out.print("Actual: ");
               System.out.println(balloon.getSurfaceArea());
               System.out.println("Expected: 104.19");
               
               // Displays the radius of the balloon
               System.out.print("Actual: ");
               System.out.println(balloon.getRadius());
               System.out.println("Expected: 2.88");
               
               balloon.addAir(100);    // Adds 100cm cube more volume of air to the Balloon
                
                // Displays the volume of the balloon
                System.out.print("Actual: ");
                System.out.println(balloon.getVolume());
                System.out.println("Expected: 200");
                
                // Displays the surface area of the balloon
               System.out.print("Actual: ");
               System.out.println(balloon.getSurfaceArea());
               System.out.println("Expected: 165.39");
               
               // Displays the radius of the balloon
               System.out.print("Actual: ");
               System.out.println(balloon.getRadius());
               System.out.println("Expected: 3.63"); 
        }
}