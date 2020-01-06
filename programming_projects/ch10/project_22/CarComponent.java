package project_22;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Timer;

public class CarComponent extends JComponent
{
   private Car car;
   
   public CarComponent()
   {
      car = new Car(0, 215, 15, "right");
   }
   
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      car.draw(g2);
   }
   
   public void repaint()
   {
      car.move(getWidth());
      super.repaint();
   }
}