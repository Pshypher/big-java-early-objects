import java.util.Random;

/**
    A robot can move infinitely along a 2D plane, in one 
    of four directions north, east, south, and west
*/
public class Robot
{
    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;
     
    public static enum Directions { NORTH, EAST, SOUTH, WEST };
    
    private Point point;
    private Directions direction;
    
    /**
        Constructs a robot at a point on the 2D plane
        @param row the vertical position of the robot in the plane
        @param column the horizontal position of the robot
    */
    public Robot(int row, int column)
    {
        final int DIRECTIONS = 4;
        
        Random generator = new Random();
        int dir = generator.nextInt(DIRECTIONS);
        switch (dir)
        {
            case 0:
                direction = Directions.NORTH;
                break;
            case 1:
                direction = Directions.EAST;
                break;
            case 2:
                direction = Directions.SOUTH;
                break;
            case 3:
                direction = Directions.WEST;
                break;                    
            default:
                break;                                                
        }
        point = new Point(row, column);
    }
    
    /**
        Default constructor for the robot at the origin(0, 0)
        of a 2D plane
    */
    public Robot()
    {
        this(0, 0);
    }
    
    /**
        Turn left, changing the orientation of this Robot 
    */
    public void turnLeft()
    {
        switch (direction)
        {
            case NORTH:
                direction = Directions.WEST;
                break;
            case WEST:
                direction = Directions.SOUTH;
                break;
            case SOUTH:
                direction = Directions.EAST;
                break;
            case EAST:
                direction = Directions.NORTH;
                break;
            default:
                break;                                                    
        }
    }
    
    /**
        Turn right, changing the orientation of the robot
    */
    public void turnRight()
    {
        switch (direction)
        {
            case NORTH:
                direction = Directions.EAST;
                break;
            case EAST:
                direction = Directions.SOUTH;
                break;
            case SOUTH:
                direction = Directions.WEST;
                break;
            case WEST:
                direction = Directions.NORTH;
                break;
            default:
                break;                                                    
        }
    }
    
    /**
        Move the robot one unit away from the current grid
        its current direction
    */
    public void move()
    {
        switch (direction)
        {
            case NORTH:
                point.setRow(point.getRow() - 1);
                break;
            case EAST:
                point.setColumn(point.getColumn() + 1);
                break;
            case SOUTH:
                point.setRow(point.getRow() + 1);
                break;
            case WEST:
                point.setColumn(point.getColumn() - 1);
                break;
            default:
                break;                                                    
        }
    }
    
    /**
        Get the current point of this Robot in the 
        2D plane
        @return the robot's location
    */
    public Point getLocation()
    {
        return point;
    }
    
    /**
        Get the robot's direction
        @return a String either one of "N","E","S" or "W" 
    */
    public String getDirection()
    {
        String output;
        switch (direction)
        {
            case NORTH:
                output = "N";
                break;
            case EAST:
                output = "E";
                break;
            case SOUTH:
                output = "S";
                break;
            case WEST:
                output = "W";
                break;
            default:
                output = "";
                break;                                                    
        }
        return output;
    }
}