public class ArrayMethodsTester4
{
    public static void main(String[] args)
    {
        int[] A = { 1 }; 
        ArrayMethods arrayUtil1 = new ArrayMethods(A);
        arrayUtil1.replaceByLargerNeighbors();
        
        System.out.println("Actual: " + arrayUtil1);
        System.out.println("Excpected: 1");
        System.out.println();
        
        int[] B = { 5, 9 };
        ArrayMethods arrayUtil2 = new ArrayMethods(B);
        arrayUtil2.replaceByLargerNeighbors();
        
        System.out.println("Actual: " + arrayUtil2);
        System.out.println("Expected: 5, 9");
        System.out.println();
        
        int[] C = { 7, 6, 12 };
        ArrayMethods arrayUtil3 = new ArrayMethods(C);
        arrayUtil3.replaceByLargerNeighbors();
        
        System.out.println("Actual: " + arrayUtil3);
        System.out.println("Expected: 7, 12, 12");
        System.out.println();
        
        int[] D = { 11, 11, 7, 9, 16, 4, 1 };
        ArrayMethods arrayUtil4 = new ArrayMethods(D);
        arrayUtil4.replaceByLargerNeighbors();
        
        System.out.println("Actual: " + arrayUtil4);
        System.out.println("Expected: 11, 11, 11, 16, 16, 16, 1");
    }
}