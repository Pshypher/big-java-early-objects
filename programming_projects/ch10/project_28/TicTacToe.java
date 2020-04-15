import java.util.Scanner;

public class TicTacToe implements Game
{
   private static final int PLAYER_1 = 0;
   private static final int PLAYER_2 = 1;
    
   private Scanner in;
   private int player;
   private TicTacToeBoard board;
    
   public TicTacToe()
   {
      in = new Scanner(System.in);
      player = (int) (Math.random() * 1);
      board = new TicTacToeBoard();
   }
    
   public String prompt()
   {
      System.out.println("Player " + (player + 1));
      System.out.print("Row (1-3): ");   
      String row = in.next();
      row = row.trim();
      System.out.print("Column (1-3): ");
      String column = in.next();
      column = column.trim();
      return row + column;
   }
   
   public boolean isValidMove(String move)
   {
      if (move.length() != 2) { 
         return false; }
      int column = Integer.parseInt(move.substring(1, 2));
      int row = Integer.parseInt(move.substring(0, 1));
      if (column < 1 || column > 3 ||
            row < 1  || row > 3)
      {
         return false;
      }
      return board.empty(--row, --column);
   }
   
   public void executeMove(String move)
   {
      int row = Integer.parseInt(move.substring(0, 1));
      int column = Integer.parseInt(move.substring(1, 2));
      if (player == PLAYER_1)
      {
         board.register('X', --row, --column);
      }
      else
      {
         board.register('O', --row, --column);
      }
   }
   
   public boolean isGameOver()
   {     
      boolean matched = board.hasSameRowCharacters() 
            || board.hasSameColumnCharacters()
            || board.hasSameDiagonalCharacters();
      return matched || board.isFilled();
   }
   
   public void display()
   {
      board.display();
      System.out.println();
   }
   
   public void toggle()
   {
      if (player == PLAYER_1)
      {
         player = PLAYER_2;
      }
      else
      {
         player = PLAYER_1;
      }
   }
   
   public String winner()
   {
      boolean matched = board.hasSameRowCharacters() 
            || board.hasSameColumnCharacters()
            || board.hasSameDiagonalCharacters();
      String out;            
      if (matched) 
      {
         out = String.format("\nPlayer %d wins", 
               (player + 1)); 
      }
      else 
      {
         out = "\nStalemate";
      }    
      return out;      
   }
}