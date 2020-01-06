public class ArrayMethodsTester1
{
    public static void main(String[] args)
    {
        int[] squares = { 1, 4, 9, 16, 25, 36, 49 };
        ArrayMethods arrayUtil = new ArrayMethods(squares);
        arrayUtil.swapFirstAndLast();
        
        System.out.println("Actual: " + arrayUtil);
        System.out.println("Expected: 49, 4, 9, 16, 25, 36, 1");
    }
}