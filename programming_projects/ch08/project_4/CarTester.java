/**
    This class tests the methods of the Car class.
*/
public class CarTester
{
    public static void main(String[] args)
    {
        Car sedan = new Car(21, 4);
        Passenger sibling = new Passenger(21, 9);
        Passenger vendor = new Passenger(21, 21);
        Passenger commuter = new Passenger(21, 14);
        Passenger traveller = new Passenger(21, 1);
        Passenger pedestrian = new Passenger(21, 10);
        Passenger hiker = new Passenger(21, 4);
        
        System.out.println(sedan.pickup(sibling));
        System.out.println("Expected: true");
        System.out.println(sedan.pickup(vendor));
        System.out.println("Expected: false");
        System.out.println(sedan.pickup(commuter));
        System.out.println("Expected: true");
        System.out.println(sedan.pickup(traveller));
        System.out.println("Expected: false");
        System.out.println(sedan.pickup(pedestrian));
        System.out.println("Expected: true");
        System.out.println(sedan.pickup(hiker));
        System.out.println("Expected: false");
        System.out.println(sedan.getNumberOfOccupiedSeats());
        System.out.println("Expected: 4");
        
        int distance = 7;
        for (int i = 0; i < distance; i++)
        {
            sedan.drive();
            hiker.move();
        }
        
        System.out.println(sedan.getNumberOfOccupiedSeats());
        System.out.println("Expected: 3");
        System.out.println(sedan.pickup(hiker));
        System.out.println("Expected: true");
        
        Car suv = new Car(3, 19);
        Passenger passenger = new Passenger(5, 17);
        
        System.out.println(suv.pickup(traveller));
        System.out.println("Expected: false");
        System.out.println(suv.alongCarRoute(passenger));
        System.out.println("Expected: true");
    }
}