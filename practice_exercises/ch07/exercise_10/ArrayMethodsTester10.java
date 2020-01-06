public class ArrayMethodsTester10
{
    public static void main(String[] args)
    {
        int[] wholeNumbers1 = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
        ArrayMethods arrayUtil1 = new ArrayMethods(wholeNumbers1);
        int[] wholeNumbers2 = {9, 4, 5, 7, 0};
        ArrayMethods arrayUtil2 = new ArrayMethods(wholeNumbers2);
        
        System.out.println("Actual: " + arrayUtil1.containsDuplicate());
        System.out.println("Expected: true");
        System.out.println();
        System.out.println("Actual: " + arrayUtil2.containsDuplicate());
        System.out.println("Expected: false");
    }
}