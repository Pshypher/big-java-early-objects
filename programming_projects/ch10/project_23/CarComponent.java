package project_23;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

import project_22.Car;

public class CarComponent extends JComponent
{
   /** Car above. */
   private Car carA;
   
   /** Car below. */
   private Car carB;
   
   /**
      Constructs an empty component, without displaying both cars.
   */
   public CarComponent()
   {
      carA = new Car(294, 155, 15, "left");
      carB = new Car(0, 215, 15, "right");   
   }
   
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      carA.draw(g2);
      carB.draw(g2);
   }
   
   public void repaint()
   {
      carA.move(getWidth());
      carB.move(getWidth());
      super.repaint();
   }
}