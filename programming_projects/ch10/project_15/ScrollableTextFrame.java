package project_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class ScrollableTextFrame extends JFrame
{
   private static final int MS_PER_SECONDS = 1000;
   
   private ScrollableTextPanel panel;
   
   class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         panel.move();
      } 
   }
   
   /**
      Starts the animation of a scrolling text across this frame.
      @param panel graphics of the text moved across this frame 
      @param rate speed of the text field.
   */
   public void animate(ScrollableTextPanel panel, int rate)
   {
      this.panel = panel;
      add(panel);
      
      final int DELAY = MS_PER_SECONDS / rate;
      ActionListener listener = new TimerListener();
      Timer t = new Timer(DELAY, listener);
      t.start();
   }
}