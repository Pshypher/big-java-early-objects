/**
    This program tests the Passenger class
*/
public class PassengerTester
{
    public static void main(String[] args)
    {    
        Passenger commuter = new Passenger(15, 4);
    
        System.out.println("Trip length: " + commuter.totalPassengerTrip());
        System.out.println("Expected: 11");
    
        System.out.println("Destination: " + commuter.getLastStop());
        System.out.println("Expected: 4");

        int steps = 3;
        for (int i = 0; i < steps; i++)
        {
            commuter.move();
        }
    
        System.out.println("Position: " + commuter.getCurrentLocation());
        System.out.println("Expected: 12");
        
        steps = 8;
        for (int i = 0; i < steps; i++)
        {
            commuter.move();
        }
        
        System.out.println(commuter.milesFromLastStop());
        System.out.println("Expected: 0");           
    }
}