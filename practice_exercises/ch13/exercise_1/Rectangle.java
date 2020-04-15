/**
   A rectangle computes its area recursively using its
   width and height
*/
public class Rectangle
{
   private int width;
   private int height;
   
   /**
      Constructs a rectangle with the given width and height.
      @param aWidth the width of the rectangle
      @param aHeight the height of the rectangle
   */
   public Rectangle(int aWidth, int aHeight)
   {
      width = aWidth;
      height = aHeight;
   }
   
   /**
      Computes the area of this rectangle recursively.
      @return the calculated area
   */
   public int getArea()
   {
      if (width <= 0) { 
         return 0; }
      else
      {
         Rectangle smallerRectangle = new Rectangle(width - 1, height);
         int smallerArea = smallerRectangle.getArea();
         return smallerArea + height;
      }
   }
}