public class ArrayMethodsTester9
{
    public static void main(String[] args)
    {
        int[] A = { 9, 7, 4, 9, 11 };
        ArrayMethods arrayUtil1 = new ArrayMethods(A);
        System.out.println("Actual: " + 
            arrayUtil1.containsAdjacentDuplicates());
        System.out.println("Expected: false");
        System.out.println();
        
        int[] B = { 11, 4, 4, 7, 9, 9, 9, 16, 1 };
        ArrayMethods arrayUtil2 = new ArrayMethods(B);
        System.out.println("Actual: " + 
            arrayUtil2.containsAdjacentDuplicates());
        System.out.println("Expected: true");                
    }
}