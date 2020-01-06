/**
        This program tests the SodaCan class
*/
public class SodaCanTester
{
        public static void main(String[] args)
        {
                // Construct an object of the SodaCan class
                SodaCan soda = new SodaCan(10.82, 6.5);
                
                System.out.print("Area: ");
                System.out.println(soda.getSurfaceArea());
                System.out.println("Expected: 176.8402");
                System.out.print("Volume: ");
                System.out.println(soda.getVolume());
                System.out.println("Expected: 359.040837");
        }
}