package project_17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToeFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 300;
   
   private TicTacToePanel tictactoe;
   private JLabel label;
   
   class AddMarkListener implements MouseListener
   {
      public void mouseClicked(MouseEvent event)
      {
         tictactoe.play(event.getX(), event.getY());
         label.setText(tictactoe.getCurrentPlayer() + "'s turn.");
      }
      public void mousePressed(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   }
   
   class RestartListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         tictactoe.reset();
      }
   }
   
   public TicTacToeFrame()
   {
      tictactoe = new TicTacToePanel();
      label = new JLabel(tictactoe.getCurrentPlayer() + "'s turn.");
      JButton button = new JButton("Restart");
      
      tictactoe.addMouseListener(new AddMarkListener());
      button.addActionListener(new RestartListener());
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      tictactoe.add(label);
      tictactoe.add(button);
      add(tictactoe);
   }
}