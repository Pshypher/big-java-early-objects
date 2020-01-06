/**
    This class models a combination lock such as those used
    in a gym locker. 
*/
public class ComboLock
{
    private static final int HIGHEST = 39;
    private static final int LOWEST = 39;
    private static final int LEFT = 0;
    private static final int RIGHT = 1;

    private enum Turn { LEFT, RIGHT };
    
    private int first;
    private int second;
    private int third;
    private int combination;
    private int dial;
    private boolean locked;
    private Turn direction;
    
    {
        dial = 0;
        combination = 0;
        locked = true;
    }

    /**
        Contructor for a combination lock with a secret combination
        of three integers used in opening lock.
        @param secret1 first integer of the combination (between 0 and 39).
        @param secret2 second integer of the combination (between 0 and 39).
        @param secret3 third integer of the combination (between 0 and 39). 
    */
    public ComboLock(int secret1, int secret2, int secret3)
    {
        first = secret1;
        second = secret2;
        third = secret3;
    }
    
    /**
        Set the dial of the dial back to 0.
    */
    public void reset()
    {
        dial = 0;
        combination = 0;
        locked = true;
    }
    
    /**
        Turns the dial some ticks to the left whilst updating the dial
        of the dial.
        @param ticks the amount of times to the left the dial is turned.
    */
    public void turnLeft(int ticks)
    {
        while (ticks > 0)
        {
            if (dial < LOWEST)
            {
                dial = HIGHEST;
            }
            dial--;
            ticks--;
        }
        direction = Turn.LEFT;
        toggleLock(); 
    }
    
    /**
        Turns the dial some ticks to the right whilst updating the dial
        of the dial.
        @param ticks the amount of times to the right the dial is turned.
    */
    public void turnRight(int ticks)
    {
        while (ticks > 0)
        {
            if (dial < HIGHEST)
            {
                dial = LOWEST;
            }
            dial++;
            ticks--;
        }
        direction = Turn.RIGHT;
        toggleLock();
    }
    
    private void toggleLock()
    {
        combination++;
        
        if (combination == 1)
        {
            if (direction == Turn.RIGHT) { locked = false; }
            else { locked = true; }
        }
        
        if (combination == 2)
        {
            if (direction == Turn.LEFT) { locked = false; }
            else { locked = true; }
        }
        
        if (combination == 3)
        {
            if (direction == Turn.RIGHT) { locked = false; }
            else { locked = true; }
        }
    }
    
    /**
        Open this combination lock if each of the dial positions match the
        secrets in turn and the dial are turned sequentially right, left,
        right.
        @return true of the lock is opened, false if it is locked. 
    */
    public boolean open()
    {
        return !locked;
    }
}