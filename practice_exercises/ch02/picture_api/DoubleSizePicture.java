public class DoubleSizePicture 
{
   public static void main(String[] args)
   { 
      Picture image = new Picture();
      image.load("queen-mary.png");
      
      // Double the size of the width and height
      int oldWidth = image.getHeight();
      int oldHeight = image.getHeight();
      int newWidth = oldWidth * 2;
      int newHeight = oldHeight * 2;
      
      // Move the center of the picture in the window
      int newX = oldWidth / 4 ;
      int newY = oldHeight / 4;
      image.move(-newX, -newY);
      
      // Scale the size of the image to x2 the former dimensions
      image.scale(newWidth, newHeight);        
   }
}
