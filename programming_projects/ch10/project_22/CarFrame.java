package project_22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CarFrame extends JFrame
{
   private static final int FRAME_HEIGHT = 300;
   private static final int FRAME_WIDTH = 400;
   
   private JComponent component;
   
   class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         component.repaint();
      }
   }
   
   public CarFrame()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      component = new CarComponent();
      add(component);
      
      ActionListener listener = new TimerListener();
      final int DELAY = 66;
      Timer t = new Timer(DELAY, listener);
      t.start();
   }
}