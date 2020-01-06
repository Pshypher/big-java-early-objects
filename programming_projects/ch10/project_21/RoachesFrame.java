package project_21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RoachesFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 300;
   
   private RoachesPanel panel;
   
   class IncreaseListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         panel.increasePopulation();
      }
   }
   
   public RoachesFrame()
   { 
      JButton button = new JButton("Add Roaches");
      ActionListener listener = new IncreaseListener();
      button.addActionListener(listener);
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      panel = new RoachesPanel();
      panel.add(button);
      add(panel);
   }
}