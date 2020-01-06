public class PolygonTester
{
   public static void main(String[] args)
   {
      Polygon polygon = new Polygon(new Point[]
         {
            new Point(0, 2), new Point(2, 0), new Point(4.73, 0.73),
            new Point(5.46, 3.46), new Point(3.46, 5.46), 
            new Point(0.73, 4.73) 
         });
         
      double area = polygon.getArea();
      System.out.println("Area: " + area);
      System.out.println("Expected: 20.78");              
   }
}