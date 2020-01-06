/**
        A class written to simulate the population of roaches 
*/
public class RoachSimulation
{
        public static void main(String[] args)
        {
                RoachPopulation roaches = new RoachPopulation(10);
                roaches.breed();        // The Roach population is now 20
                roaches.spray(10);      // The Roaches have been reduced to 18
                
                System.out.print("actual: ");
                System.out.println(roaches.getRoaches());
                System.out.println("expected: 18");
                
                roaches.breed();        // The current count for the Roaches is 36
                roaches.spray(10);      // Roach population reduced to 32
                
                System.out.print("actual: ");
                System.out.println(roaches.getRoaches());
                System.out.println("expected: 32");
                
                roaches.breed();        // Population of Roaches now 64
                roaches.spray(20);      // Population of Roaches reduced by 12-13
                
                System.out.print("actual: ");
                System.out.println(roaches.getRoaches());
                System.out.println("expected: 51");
                
                roaches.breed();
                roaches.spray(32);
                
                System.out.print("actual: ");
                System.out.println(roaches.getRoaches());
                System.out.println("expected: 69");               
        }
}