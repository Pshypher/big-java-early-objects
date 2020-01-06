package project_27;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class MoveableRectangle extends Rectangle 
   implements MoveableShape
{
   private boolean forward;
    
   public MoveableRectangle(int x, int y, int width,
         int height)
   {
      super(x, y, width, height);
   }
   
   public void draw(Graphics2D g2)
   {
      g2.draw(super.getBounds());
   }
   
   public void move(int width)
   {     
      if (super.getMaxX() > width) { forward = false; }
      else if (super.getX() <= 0) {forward = true; }
      
      int dx = forward ? 1 : -1;
      super.translate(dx, 0);
   }             
}
