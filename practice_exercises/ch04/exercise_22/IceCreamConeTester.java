/**
        This program displays the surface area and volume for
        an object of the IceCreamCone class
*/

public class IceCreamConeTester
{
        public static void main(String[] args)
        {              
                // Construct objects of the IceCreamCone class
                IceCreamCone raspberrySmall = new IceCreamCone(4, 3);
                IceCreamCone strawberryLarge = new IceCreamCone(12, 5);
        
                // Calculate and display the results of the surface area and
                // the volume of the raspberry small cone
                System.out.print("Area: ");
                System.out.println(raspberrySmall.getSurfaceArea());
                System.out.println("Expected: 47.12");
                
                System.out.print("Volume: ");
                System.out.println(raspberrySmall.getVolume());
                System.out.println("Expected: 37.699");
                
                // Calculate and display the results of the surface area and
                // the volume of the strawberry large cone
                System.out.print("Area: ");
                System.out.println(strawberryLarge.getSurfaceArea());
                System.out.println("Expected: 204.2035");
                
                System.out.print("Volume: ");
                System.out.println(strawberryLarge.getVolume());
                System.out.println("Expected: 314.159");
        }  
}