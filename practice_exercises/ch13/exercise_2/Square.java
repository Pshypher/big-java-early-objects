/**
   A square has an area calculated using its width
*/
public class Square
{
   public int width;
   
   /**
      Constructs a square with the given width.
      @param aWidth the width (and height) of the square
   */
   public Square(int aWidth)
   {
      width = aWidth;
   }
   
   /**
      Calculates the area of this square .
      @return the area of the square
   */
   public int getArea()
   {
      if (width <= 0) { 
         return 0; }
      else
      {
         Square smallerSquare = new Square(width - 1);
         int smallerArea = smallerSquare.getArea();
         return smallerArea + width + width - 1;
      } 
   }
}