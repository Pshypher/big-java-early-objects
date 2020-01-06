public class ComboLockTester
{
    public static void main(String[] args)
    {
        ComboLock lock = new ComboLock(27, 12, 21);
        lock.turnRight(27);
        lock.turnLeft(15);
        lock.turnRight(9);
       
        System.out.println("Actual: " + lock.open());
        System.out.println("Expected: " + true);
        
        ComboLock gymLock = new ComboLock(16, 9, 25);
        gymLock.turnRight(16);
        gymLock.turnRight(32);
        gymLock.turnLeft(23);
        
        System.out.println("Actual: " + gymLock.open());
        System.out.println("Expected: " + false);
    }
}