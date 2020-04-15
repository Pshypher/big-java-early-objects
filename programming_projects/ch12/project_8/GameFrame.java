import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameFrame extends JFrame
{
   private AnalogClock aClock;
   private Game game;
   private ClockPanel clock;
   private ControlPanel control;
   private GamePanel panel;
   
   public GameFrame()
   {
      aClock = new AnalogClock(100, 35, 100);
      game = new Game(aClock); 
      clock = new ClockPanel();
      control = new ControlPanel();
      panel = new GamePanel();
      setLayout(new BorderLayout());
      add(panel, "Center");
   }
   
   class GamePanel extends JPanel
   {
      public GamePanel()
      {
         setLayout(new BorderLayout());
         add(clock, "Center");
         add(control, "South"); 
         
      }
   }
   
   class ClockPanel extends JComponent
   {   
      public void paintComponent(Graphics g)
      {
         Graphics2D g2 = (Graphics2D) g;
         game.nextTime();
         aClock.draw(g2);
      }
   }
   
   class ControlPanel extends JPanel
   {
      private JComboBox<Integer> hours;
      private JComboBox<Integer> minutes;
      private JButton button;
      
      public ControlPanel()
      {   
         hours = new JComboBox<Integer>();
         for (int i = 0; i < AnalogClock.HOURS; i++)
         {
            hours.addItem(i);
         }
         
         minutes = new JComboBox<Integer>();
         for (int j = 0; j < AnalogClock.MINUTES; j++)
         {
            minutes.addItem(j);
         }
         
         button = new JButton("Submit");
         button.addActionListener(new SubmitListener());
         
         setLayout(new FlowLayout());
         add(new JLabel("Hour"));
         add(hours);
         add(new JLabel("Minutes"));
         add(minutes);
         add(button);
      }
      
      class SubmitListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            Time time = new Time((int) hours.getSelectedItem(),
               (int) minutes.getSelectedItem());
            boolean correct = game.checkResponse(time); 
            if (game.getState() == Game.REVEAL)
            {
               panel.repaint();
               JOptionPane.showMessageDialog(null, "Answer = " 
                  + game.reveal() + "\n" + game.format());
               game.reset();
            }
            
            if (correct) { panel.repaint(); }   
         }
      }
   }
}