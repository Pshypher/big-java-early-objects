/**
    This program tests the Clock and WorldClock classes. 
*/
public class ClockDemo
{
    public static void main(String[] args)
    {
        Clock domestic = new Clock();
        WorldClock foreign = new WorldClock(-6);
       
        System.out.println("Local Time: " + domestic.getTime());
        System.out.println("Foreign Time: " + foreign.getTime());
    }
}