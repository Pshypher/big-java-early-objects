package project_27;

import java.awt.Graphics2D;

/**
   Describes objects capable of drawing and moving 
   objects.
*/
public interface MoveableShape
{
   /**
      Paints a shape on a canvas.
      @param g2 the graphics context
      @param obj the moveable object
   */
   void draw(Graphics2D g2);
   
   /**
      Moves a shape horizontally across a canvas.
      @param width width of the canvas
      @param obj the moveable object
   */
   void move(int width);
}
