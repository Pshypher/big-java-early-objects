import java.awt.Color;

public class DarkerDemo 
{
   public static void main(String[] args) 
   { 
      Color red = Color.RED;
      red = red.darker().darker();
      System.out.println("Red: " + red.getRed());
      System.out.println("Green: " + red.getGreen());
      System.out.println("Blue: " + red.getBlue());
   }
}
