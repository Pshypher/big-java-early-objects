public class ArrayMethodsTester8
{
    public static void main(String[] args)
    {
        int[] sortedSquares = { 1, 4, 9, 16, 25 };
        ArrayMethods arrayUtil1 = new ArrayMethods(sortedSquares);
        int[] unsortedSquares = { 16, 9, 25, 4, 1 };
        ArrayMethods arrayUtil2 = new ArrayMethods(unsortedSquares); 
        
        System.out.println("Actual: " + arrayUtil1.isSorted());
        System.out.println("Expected: true");
        System.out.println();
        System.out.println("Actual: " + arrayUtil2.isSorted());
        System.out.println("Expected: false");
    }
}