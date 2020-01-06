public class SquareTester
{
   public static void main(String[] args)
   {
      Square s = new Square(7);
      int area = s.getArea();
      System.out.println("Area: " + area);
      System.out.println("Expected: 49");
   }
}