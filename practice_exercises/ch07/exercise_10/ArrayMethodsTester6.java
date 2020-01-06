public class ArrayMethodsTester6
{
    public static void main(String[] args)
    {
        int[] A = { 2, 4, 6, 8, 10 };
        ArrayMethods arrayUtil1 = new ArrayMethods(A);
        arrayUtil1.shiftEvenElementsLeft();
        
        int[] B = { 3, 5, 6, 7, 2, 8, 11 };
        ArrayMethods arrayUtil2 = new ArrayMethods(B);
        arrayUtil2.shiftEvenElementsLeft();
        
        int[] C = { 7, 5, 9, 11 };
        ArrayMethods arrayUtil3 = new ArrayMethods(C);
        arrayUtil3.shiftEvenElementsLeft();
        
        System.out.println("Actual: " + arrayUtil1);
        System.out.println("Expected: 2, 4, 6, 8, 10");
        System.out.println();
        System.out.println("Actual: " + arrayUtil2);
        System.out.println("Expected: 8, 2, 6, 7, 5, 11, 3");
        System.out.println();
        System.out.println("Actual: " + arrayUtil3);
        System.out.println("Expected: 5, 9, 11, 7");
        System.out.println();
    }
}