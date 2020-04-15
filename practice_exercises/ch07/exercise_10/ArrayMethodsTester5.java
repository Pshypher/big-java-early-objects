public class ArrayMethodsTester5
{
    public static void main(String[] args)
    {
        int[] A = { 7, 6, 8, 9, 5, 10 };
        ArrayMethods arrayUtil1 = new ArrayMethods(A);
        arrayUtil1.removeMiddleElement();
        
        int[] B = { 1, 9, 4, 7, 4 };
        ArrayMethods arrayUtil2 = new ArrayMethods(B);
        arrayUtil2.removeMiddleElement();
        
        System.out.println("Actual: " + arrayUtil1);
        System.out.println("Expected: 7, 6, 5, 10");
        System.out.println();
        System.out.println("Actual: " + arrayUtil2);
        System.out.println("Expected: 1, 9, 7, 4");
    }
}