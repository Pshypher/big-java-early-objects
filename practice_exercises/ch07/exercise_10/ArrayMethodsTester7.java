public class ArrayMethodsTester7
{
    public static void main(String[] args)
    {
        int[] A = { 3, 6 };
        ArrayMethods arrayUtil0 = new ArrayMethods(A);
        System.out.println("Actual: " + arrayUtil0.secondLargest());
        System.out.println("Expected: 3");
        
        int[] B = { 49, 25, 9, 16, 4, 36, 1 };
        ArrayMethods arrayUtil2 = new ArrayMethods(B);
        System.out.println("Actual: " + arrayUtil2.secondLargest());
        System.out.println("Expected: 36");
    }
}