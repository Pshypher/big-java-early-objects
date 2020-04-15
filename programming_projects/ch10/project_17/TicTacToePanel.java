package project_17;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

import project_19.TicTacToeBoard;

public class TicTacToePanel extends JPanel
{   
   private static final int WIDTH = 50;
   private static final int X_LEFT = 60;
   private static final int Y_TOP = 45;
   
   private TicTacToeBoard board;
   private char player;
   
   public TicTacToePanel()
   {
      final int FONT_SIZE = (WIDTH * 3) / 5;
      board = new TicTacToeBoard();
      player = 'X';
      
      setFont(new Font(Font.SERIF, Font.BOLD, FONT_SIZE));
   }
   
   public void paintComponent(Graphics g)
   {     
      super.paintComponent(g); 
      
      final int KERN_SIZE = WIDTH / 5;
      
      Graphics2D g2 = (Graphics2D) g;
      
      Line2D.Double topHorizontal = new Line2D.Double(
            0 + X_LEFT, WIDTH + Y_TOP, 
            WIDTH * 3 + X_LEFT, WIDTH + Y_TOP);
      Line2D.Double bottomHorizontal = new Line2D.Double(
            0 + X_LEFT, 2 * WIDTH + Y_TOP,
            3 * WIDTH + X_LEFT, 2 * WIDTH + Y_TOP);
      Line2D.Double leftVertical = new Line2D.Double(
            WIDTH + X_LEFT, Y_TOP, 
            WIDTH + X_LEFT, 3 * WIDTH + Y_TOP);
      Line2D.Double rightVertical = new Line2D.Double(
            2 * WIDTH + X_LEFT, Y_TOP,
            2 * WIDTH + X_LEFT, 3 * WIDTH + Y_TOP);
      
      g2.draw(topHorizontal);
      g2.draw(bottomHorizontal);
      g2.draw(leftVertical);
      g2.draw(rightVertical);
      
      for (int i = 0; i < board.getRowSize(); i++)
      {
         for (int j = 0; j < board.getColumnSize(); j++)
         {
            int xBasePoint = 10 + j * WIDTH + X_LEFT;
            int yBasePoint = (i + 1) * WIDTH + Y_TOP - KERN_SIZE;
            Color c = (board.getChar(i, j) == 'X') ? Color.RED : Color.YELLOW;
            g2.setColor(c);
            g2.drawString(board.getChar(i, j) + "", xBasePoint, yBasePoint);                  
         }
      }
      
      if (board.hasSameRowCharacters() 
            || board.hasSameColumnCharacters()
            || board.hasSameDiagonalCharacters()) 
      {
         g2.setColor(Color.BLACK);
         g2.drawString(player + " wins.", 
            (getWidth() * 3) / 10,
            (getHeight() * 9) / 10);          
      }
   }
   
   /**
      Places an X or O on a previously unmarked location
      in the tictactoe board.
      @param playerID either an X or O
   */
   public void play(int mouseX, int mouseY)
   {
      if (board.hasSameRowCharacters() 
            || board.hasSameColumnCharacters()
            || board.hasSameDiagonalCharacters()
            || board.filled()) 
      {
         return;
      }
      
      if (mouseX >= X_LEFT
         && mouseY >= Y_TOP 
         && mouseX <= X_LEFT + WIDTH * 3 
         && mouseY <= Y_TOP + WIDTH * 3)
      {
         int row = (mouseY - Y_TOP) / WIDTH;
         int column = (mouseX - X_LEFT) / WIDTH;
         if (board.register(player, row, column))
         {
            if (!(board.hasSameRowCharacters() 
               || board.hasSameColumnCharacters()
               || board.hasSameDiagonalCharacters())) 
            {
               toggle();
            }
            repaint();
         }
      }
   }
   
   private void toggle()
   {
      if (player == 'X')
      {
         player = 'O';
      }
      else
      {
         player = 'X';
      }
   }
   
   /**
      Gets the current player id.
      @return current player id
   */
   public char getCurrentPlayer()
   {
      return player;
   }
   
   /**
      Resets the this tictactoe game.
   */
   public void reset()
   {
      board.clear();
      repaint();
   }
}