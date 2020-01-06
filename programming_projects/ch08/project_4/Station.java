import java.util.ArrayList;
import java.util.Random;

public class Station
{
    private static final int TOTAL_MILES = 30;
    
    private ArrayList<Car> cars;
    private ArrayList<Passenger> departures;
    private ArrayList<Passenger> arrivals;
    private int location;
    private Random generator;
    
    private static int lastAssignedMiles;
    
    static
    {
        lastAssignedMiles = 0;
    }
    
    /**
        Constructs a station with no cars and passengers on standby.
    */
    public Station()
    {
        generator = new Random();
        cars = new ArrayList<Car>();
        departures = new ArrayList<Passenger>();
        arrivals = new ArrayList<Passenger>();
        location = lastAssignedMiles;
        lastAssignedMiles++;
    }
    
    /**
        Generates a random number of passengers waiting to be driven
        to their destination.
    */
    public void generatePassengers()
    {
        final int MAX_PASSENGERS = 20;
        
        int limit = generator.nextInt(MAX_PASSENGERS + 1);  // departing 
                                                            // passengers
        for (int i = 1; i <= limit; i++)
        {
            int destination = generator.nextInt(TOTAL_MILES);
            Passenger p = new Passenger(location, destination);
            departures.add(p);
        }
    }
    
    /**
        Generates a random number of cars that begin their trip from
        this station.
    */
    public void generateCars()
    {
        final int MAX_CARS = 5;
        int limit = generator.nextInt(MAX_CARS + 1);
        
        for (int i = 1; i <= limit; i++)
        {
            int destination = generator.nextInt(TOTAL_MILES);
            Car c = new Car(location, destination);
            cars.add(c);
        }
    }
    
    /**
        Adds a car to the parking lot within this station.
        @param c car parked in the station's lot. 
    */
    public void addCar(Car c)
    {
        cars.add(c);
    }
    
    /**
        Get a car within this station at the specified position.
        @param pos position of the car
        @return car within this station.
    */
    public Car getCar(int pos)
    {
        return cars.get(pos);
    }
    
    /**
        Compute the number of cars parked at this station.
        @return number of cars in this station.
    */
    public int getNumberOfCars()
    {
        return cars.size();
    }
    
    /**
        Adds passenger to the set of commuters whose destination
        is this particular station.
        @param p passenger arriving at their last stop.
    */
    public void addArrival(Passenger p)
    {
        arrivals.add(p);
    }
    
    /**
        Get a passenger who plans to make a trip to a different station.
        @param pos position of passenger within the queue at this station
        @return a passenger
    */
    public Passenger getPassenger(int pos)
    {
        return departures.get(pos);
    }
    
    /**
        Compute the number of passenger waiting for a vehicle.
        @param number of passengers whose designated target station
        is different from this one
    */
    public int getQueueSize()
    {
        return departures.size();
    }
    
    /**
        Returns the location of this station along the route 
        relative to other stations
        @return distance in miles of this station.
    */
    public int location()
    {
        return location;
    }
    
    /**
        Removes a passenger from a station whenever a passenger leaves
        the queue to join a car.
        @param p the departing passenger
    */
    public void removePassenger(Passenger p)
    {
        departures.remove(p);
    }
    
    /**
        Removes a loaded vehicle from this station when the vehicle departs.
        @param the car to be removed.
    */
    public void removeCar(Car c)
    {
        cars.remove(c);   
    }
}