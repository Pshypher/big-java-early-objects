/**
    This class tests the methods bag class
*/
public class BagTester
{
    public static void main(String[] args)
    {
        Bag aBag = new Bag();
        
        aBag.add("Slippers");
        aBag.add("Cologne");
        aBag.add("Slippers");
        aBag.add("Cologne");
        aBag.add("Slippers");
        
        System.out.println("Cologne: " + aBag.count("cologne"));
        System.out.println("Expected: 2");
        System.out.println("Slippers: " + aBag.count("slippers"));
        System.out.println("Expected: 3");
        System.out.println(aBag);
        System.out.println("Expected: [Bag$Item[name=Slippers,quantity=3],Bag$Item[name=Cologne,quantity=2]]");
    }
}