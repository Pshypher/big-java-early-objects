package project_27;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 400;
   
   private AnimationPanel panel;
   
   class MotionListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {   
         panel.redraw();
      }         
   }
   
   public AnimationFrame()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      panel = new AnimationPanel();
      add(panel);
      
      ActionListener listener = new MotionListener();
      final int DELAY = 66;
      Timer t = new Timer(DELAY, listener);
      t.start();
   }
}

