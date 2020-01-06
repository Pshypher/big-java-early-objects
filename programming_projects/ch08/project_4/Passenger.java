/**
    A passenger in a car sharing system.
*/
public class Passenger
{
    private int origin;
    private int destination;
    private int distanceFromLastStop;
    private int delta;
        
    /**
        Constructs a passenger at a bus terminal going to the
        specified destination.
        @param start place where this passenger boards a vehicle.
        @param stop last stop of the passenger.
    */
    public Passenger(int start, int stop)
    {
        origin = start;
        destination = stop;
        distanceFromLastStop = stop - start;
        if (distanceFromLastStop < 0) { delta = 1; }
        else { delta = -1; }
    }
    
    /**
        Updates passenger position away from destination each
        time the car moves.
    */
    public void move()
    {
        distanceFromLastStop = distanceFromLastStop + delta;
    }
    
    /**
        Get the current location of this passenger in one of several stations.
        @return current position
    */
    public int getCurrentLocation()
    {
        return getLastStop() - milesFromLastStop();
    }
    
    /**
        Computes the distance away from this passenger last stop.
        @return distance away from last stop.
    */
    public int milesFromLastStop()
    {
        return distanceFromLastStop;
    }
    
    /**
        Compute the total distance to be travelled by this passenger.
        @return distance in miles from current location to destination. 
    */
    public int totalDistance()
    {
        return destination - origin;
    }
    
    /**
        Get the last stop of this passenger.
        @return position of this passenger's destination.
    */
    public int getLastStop()
    {
        return destination;
    }
    
    /**
        Update the location where this passenger's journey begins.
        @param newOrigin new location where passenger is likely to be picked.
    */
    public void setOrigin(int newOrigin)
    {
        origin = newOrigin;
    }
}