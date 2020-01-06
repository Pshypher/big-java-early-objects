public class ArrayMethodsTester3
{
    public static void main(String[] args)
    {
        int[] firstTenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayMethods arrayUtil = new ArrayMethods(firstTenDigits);
        arrayUtil.replaceEvenElements();
        
        System.out.println("Actual: " + arrayUtil);
        System.out.println("Expected: 0, 1, 0, 3, 0, 5, 0, 7, 0, 9");
         
    }
}