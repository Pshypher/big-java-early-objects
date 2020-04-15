import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.*;

/**
    This class simulates a car sharing system whereby car commuters
    pick up and drop off passengers at designated stations.
*/
public class Simulation
{
    public static final int TOTAL_MILEAGE = 30;
    
    private Station[] stations;
    private int totalMilesDriven;
    
    /**
        Construct a class that simulates a car sharing system. 
    */
    public Simulation()
    {
        stations = new Station[TOTAL_MILEAGE];
        totalMilesDriven = 0;
    }
    
    /**
        Sets up this simulation. 
    */
    public void setup()
    {
        for (int i = 0; i < stations.length; i++)
        {
            Station station = new Station();
            station.generateCars();
            station.generatePassengers();
            stations[i] = station;       
        }      
    }
    
    /**
        At each station, randomly load each car with passengers
        going along the car's route.
    */
    public void loadPassengers()
    {
        for (Station s : stations)
        {
            int numberOfCars = s.getNumberOfCars();
            for (int i = 0; i < numberOfCars; i++)
            {
                Car c = s.getCar(i);
                load(s, c);
            }
        } 
    }
    
    /**
        Generate a  loading plan such that each car is loaded with at most 3
        passengers travelling the furthest along the car's route.
        @param s the current station.
        @param c the car to be shared among commuters.
    */
    private void load(Station s, Car c)
    {
        Random generator = new Random();
        ArrayList<Passenger> passengers = getPassengers(s, c);
        
        for (int i = 0; i < passengers.size(); i++)
        {
            Passenger p = passengers.get(i);
            int numberOfPassengers = lookUpAlongCarRoute(p, c);
            if (numberOfPassengers + 1 < c.CAPACITY) 
            {
                c.pickup(p);
                passengers.remove(p);
                s.removePassenger(p);   
            } 
        }
    }
    
    /**
        Counts the number of passenger travelling further than the given
        passenger along a car's route.
        @param p the passenger
        @param c the car
        @return the number of passengers going further along the
        route of the car
    */
    private int lookUpAlongCarRoute(Passenger p, Car c)
    {
        int numberOfPassengers = 0;
        int current = c.getCurrentLocation();
        int destination = c.getLastStop();
        
        for (int i = current; i < destination; i++)
        {
            Station s = stations[i];
            ArrayList<Passenger> passengers = getPassengers(s, c);
            for (int j = 0; j < passengers.size(); j++)
            {
                Passenger q = passengers.get(j);
                if (abs(p.totalDistance()) < abs(q.totalDistance()))
                {
                    // passenger at a further station travelling further
                    // than the given passenger along the car's route 
                    numberOfPassengers++;
                }
            }
        }
        return numberOfPassengers;
    }
    
    /**
        Collects the set of passengers travelling along the same route as the
        given vehicle.
        @param s the station with passenger likely going along the route of the
        given car.
        @param c the car searching for passengers going along its route 
        @return passenger travelling along the route of the car
    */
    private ArrayList<Passenger> getPassengers(Station s, Car c)
    {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        int queueSize = s.getQueueSize();
        for (int i = 0; i < queueSize; i++)
        {
            Passenger p = s.getPassenger(i);
            if (c.alongCarRoute(p)) { passengers.add(p); }
        }
        
        return passengers;
    }
    
    /**
        Drive the cars at each station to their designated target stations.
    */
    public void driveCars()
    {
        // Run the simulation until the car(s) and passenger(s) travelling 
        // the furthest arrives at their last stop.
        int furthest = getLongestDistance();
        int steps = 0;
        while (steps < furthest)
        {
            for (Station s : stations)
            {
                for (int i = 0; i < s.getNumberOfCars(); i++)
                {
                    Car c = s.getCar(i);
                    if (abs(c.milesFromLastStop()) > 0)
                    {
                        s.removeCar(c);
                        ArrayList<Passenger> passengers = c.drive();
                        totalMilesDriven++; 
                        Station current = stations[c.getCurrentLocation()];
                        for (Passenger p : passengers)
                        {  
                            // drop passengers at their destination
                            current.addArrival(p); 
                        }
                        current.addCar(c);  // add car to its current location
                        load(current, c);   // add more passengers if possible
                    } 
                }
            }
            steps++;
        }
    }
    
    /**
        Computes the total revenue per mile generated in this simulation.
        @return the total revenue per mile
    */
    public double getRevenuePerMile()
    {
        double totalIncome = 0;
        for (Station s : stations)
        {
            int numberOfCars = s.getNumberOfCars();
            for (int i = 0; i < numberOfCars; i++)
            {
                Car c = s.getCar(i);
                totalIncome = totalIncome + c.getTotalIncome();
            }
        }
        return totalIncome / totalMilesDriven;
    }
    
    /**
        Compute the furthest distance travelled by a car, comparing 
        the distance of the journey of each car in all the stations.
        @return the maximum distance travelled in this simulation.
    */
    private int getLongestDistance()
    {
        int furthest = 0;
        for (Station s : stations)
        {
            int numberOfCars = s.getNumberOfCars();
            for (int i = 0; i < numberOfCars; i++)
            {
                Car c = s.getCar(i);
                if (abs(c.totalDistance()) > furthest)
                {
                    furthest = abs(c.totalDistance());
                }
            }
        }
        
        return furthest;
    }
}