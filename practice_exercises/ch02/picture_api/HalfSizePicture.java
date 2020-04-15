public class HalfSizePicture 
{
   public static void main(String[] args)
   { 
      Picture image = new Picture();
      image.load("queen-mary.png");
      
      // Set the width of the image to half the width of the former
      int oldWidth = image.getWidth();
      int newWidth = oldWidth / 2;
      
      // Set the height of the image to half the height of the former
      int  oldHeight = image.getHeight();
      int  newHeight = oldHeight / 2;
      
      // Scales the dimension of the image to the newWidth and newHeight
      image.scale(newWidth, newHeight);
      
      // Calculates the new x and y coordinates for the scaled down image
      int newX = (oldWidth - newWidth) / 2;
      int newY = (oldHeight - newHeight) / 2;
      image.move(newX, newY);
   }
}
