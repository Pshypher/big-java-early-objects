public class RectangleTester
{
   public static void main(String[] args)
   {
      Rectangle r = new Rectangle(15, 10);
      int area = r.getArea();
      System.out.println("Area: " + area);
      System.out.println("Expected: 150");
   }
}