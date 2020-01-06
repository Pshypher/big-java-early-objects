import java.util.ArrayList;

import static java.lang.Math.*;

/**
    Models a car used by car commuters and passengers in a
    car sharing system.
*/
public class Car
{
    public static final int CAPACITY = 4;
    public static final double FARE = 1.0;
    
    private ArrayList<Passenger> seats;
    private double income;
    private int origin; 
    private int destination;
    private int distanceFromLastStop;
    private int delta;
    
    /**
        Construct a car used to pick and drop off passengers at the designated 
        stations.
        @param origin location where a car starts its trip.
        @param target place where the journey of this car's trip ends.
    */
    public Car(int origin, int target)
    {
        seats = new ArrayList<Passenger>();
        income = 0;
        this.origin = origin;
        destination = target;
        distanceFromLastStop = target - origin;
        if (distanceFromLastStop < 0) { delta = 1; }
        else { delta = -1; } 
    }
    
    /**
        Picks up passengers going along the route of this vehicles
        destination.
        @param p passenger that likely to be picked up by this car.
        @return true if the passenger in the given station enters this
        vehicle, otherwise false.
    */
    public boolean pickup(Passenger p)
    {
        boolean picked = false;
        if (seats.size() + 1 < CAPACITY && alongCarRoute(p))
        { 
            seats.add(p);
            picked = true;
        }
        
        return picked;  
    }
    
    /**
        Checks whether the passenger travels along the same route
        as this car and before or at this car's last stop.
        @param p the passenger
        @return true of the passenger goes along the route of this
        car, false otherwise
    */
    public boolean alongCarRoute(Passenger p)
    {
        boolean along = false;
        if (milesFromLastStop() < 0 && p.milesFromLastStop() < 0)
        {
            along = getCurrentLocation() >= p.getCurrentLocation()  
                && destination <= p.getLastStop();
        }
        else if (milesFromLastStop() > 0 && p.milesFromLastStop() > 0)
        {
            along = getCurrentLocation() <= p.getCurrentLocation()
                && destination >= p.getLastStop();
        }
        
        return along;
    }
    
    /**
        Compute the distance away from this car's last stop.
        @return distance away from destination
    */
    public int milesFromLastStop()
    {
        return distanceFromLastStop;
    }
    
    /**
        Compute the total distance to be travelled by this car.
        @return distance in miles that the car travels.
    */
    public int totalDistance()
    {
        return destination - origin;
    }
        
    /**
        Drives this car between various stations, checking if passengers
        have arrived at their last stop along its route.
        @return set of passengers already at their target destination.
    */
    public ArrayList<Passenger> drive()
    {
        distanceFromLastStop = distanceFromLastStop + delta;
        ArrayList<Passenger> droppedOffPassengers = new ArrayList<Passenger>(); 
        int i = 0;
        while (i < seats.size())
        {
            // update each passenger position
            Passenger p = seats.get(i);
            p.move();
            income = income + FARE;
            if (abs(p.milesFromLastStop()) > 0)
            {
                i++;
            }
            else
            {
                drop(p);
                droppedOffPassengers.add(p);
            }
        }
        
        return droppedOffPassengers;
    }
    
    /**
        Computes the total amount earned for the entire trip by a car commuter.
        @return income earned for the entire journey.     
    */
    public double getTotalIncome()
    {
        return income;
    }
    
    /**
        Get the station where this car is parked.
        @return current station where car is located.
    */
    public int getCurrentLocation()
    {
        return destination - distanceFromLastStop;
    }
    
    /**
        Get the number of passengers along with the driver in this car.
        @return the number of persons seated in this car.
    */
    public int getNumberOfOccupiedSeats()
    {
        return seats.size() + 1;
    }
    
    /**
        Drop off the given passenger from this vehicle.
        @param p the passenger to be removed from this vehicle
    */
    public void drop(Passenger p)
    {
        seats.remove(p);
    }
    
    /**
        Get the last stop of this car.
        @return this car's target station.
    */
    private int getLastStop()
    {
        return destination;
    }
}