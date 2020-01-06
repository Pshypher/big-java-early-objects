package project_17;

import javax.swing.JFrame;

public class TicTacToeViewer
{  
   public static void main(String[] args)
   {
      JFrame frame = new TicTacToeFrame();
      frame.setTitle("TicTacToe");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}