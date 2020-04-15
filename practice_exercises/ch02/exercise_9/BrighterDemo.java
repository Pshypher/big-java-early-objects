import java.awt.Color;

/**
   @author ehost
*/
public class BrighterDemo 
{
   public static void main(String[] args)
   {
      Color rgb = new Color(50, 100, 150);
      rgb = rgb.brighter();
      System.out.println("Red: " + rgb.getRed());
      System.out.println("Green: " + rgb.getGreen());
      System.out.println("Blue: " + rgb.getBlue());
   }
   
}
