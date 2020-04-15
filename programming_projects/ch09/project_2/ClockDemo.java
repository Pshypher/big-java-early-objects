/**
    This program is a demonstration of the clock class
*/
public class ClockDemo
{
    public static void main(String[] args)
    {
        Clock local = new Clock();
        local.setAlarm(10, 00);
        System.out.println(local.getTime());
        System.out.println(local.getTime());
        
        WorldClock foreign = new WorldClock(-6);
        foreign.setAlarm(04, 00);
        System.out.println();
        System.out.println(foreign.getTime());
        System.out.println(foreign.getTime());
    }
}