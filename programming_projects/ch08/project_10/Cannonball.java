import java.awt.Point;
import java.util.ArrayList;

public class Cannonball
{
    private static final double GRAVITATIONAL_CONSTANT = -9.8;
    
    private double x;
    private double y;
    private double xVel;
    private double yVel;
    
    /**
        Constructor for a cannonball at a random x position
        and a y position of 0.
        @param xLeft initial x position of this cannonball.
    */
    public Cannonball(int xLeft)
    {
        x = xLeft;
        y = 0;
    }
    
    /**
        Move this cannon ball after the specified time.
        @param deltaSec the number of seconds it takes to change
        the x and y positions of this cannonball.
    */
    public void move(double deltaSec)
    {
        double deltaX = xVel * deltaSec;
        double deltaY = yVel * deltaSec;
        x = x + deltaX;
        y = y + deltaY;
        
        yVel = yVel + deltaSec * GRAVITATIONAL_CONSTANT;
    }
    
    /**
        Get the current location of this cannonball, rounded
        to integer coordinates.
        @return x, y-coordinates of this cannonball
    */
    public Point getLocation()
    {
        Point pt = new Point((int) x, (int) y);
        return pt;
    }
    
    /**
        Computes the set of points that lies on the plane of trajectory
        of the cannonball.
        @param alpha angle of elevation in degrees.
        @param v initial velocity.
        @param deltaSec the time interval.
        @return set of points along the trajectory of this cannonball.
    */
    public ArrayList<Point> shoot(double alpha, double v, double deltaSec)
    {   
        ArrayList<Point> trajectory = new ArrayList<Point>();
        
        xVel = v * Math.cos(Math.toRadians(alpha));
        yVel = v * Math.sin(Math.toRadians(alpha));
                
        do
        {   
            Point pt = getLocation();
            if (pt.getY() >= 0) { trajectory.add(pt); }
            move(deltaSec);
        }
        while (y >= 0);
        
        return trajectory;
    }
}