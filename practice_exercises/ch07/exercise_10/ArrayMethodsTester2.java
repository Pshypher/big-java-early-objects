public class ArrayMethodsTester2
{
    public static void main(String[] args)
    {
        int[] squares = { 1, 4, 9, 16, 25 };
        ArrayMethods arrayUtil = new ArrayMethods(squares);
        arrayUtil.shiftRight();
        
        System.out.println("Actual: " + arrayUtil);
        System.out.println("Expected: 25, 1, 4, 9, 16");
    }
}