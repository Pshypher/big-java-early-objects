package project_15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class ScrollableTextPanel extends JPanel
{  
   private String text;
   private ScrollableTextViewer.Direction orientation;
   
   public void paintComponent(Graphics g)
   {
      final int KERN_SIZE = 10;
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      int baseLine = (int) getHeight() - getFont().getSize() - KERN_SIZE;
      g2.drawString(text, 0, baseLine);
   }
   
   /**
      Sets the direction of this text field either left or right
      @param dir the direction of the text field
   */
   public void setDirection(ScrollableTextViewer.Direction direction)
   {
      orientation = direction;
   }
   
   /**
      Sets the text to be displayed on this component.
      @param msg the text 
   */
   public void setText(String msg)
   {
      text = msg;
   }
   
   /**
      Moves this text field horizontally across its parent container.
   */
   public void move()
   {
      int width = getWidth();
      int y = 25;
      
      if (orientation == ScrollableTextViewer.Direction.RIGHT)
      {
         if (getX() > width) 
         {
            int x = (int) getBounds().getWidth() * -1;
            setLocation(x, y);
         }
         else 
         { 
            setLocation(getX() + 1, y);
         }
      }
      else
      {
         if (getBounds().getMaxX() < 0) 
         {
            setLocation(width, y);
         }
         else 
         {
            setLocation(getX() - 1, y);
         }
      }
      
      repaint();
   }
}

