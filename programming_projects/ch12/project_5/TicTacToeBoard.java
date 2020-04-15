import java.util.Arrays;

/**
    This class models a tictactoe board with one of
    X or O characters on its grid.
*/
public class TicTacToeBoard implements Cloneable
{

   public static final int SIZE = 3;
   
   private char[][] board;
   
   /**
       Construct an empty 3x3 tic-tac-toe board
   */
   public TicTacToeBoard()
   {
      board = new char[SIZE][SIZE];
   }
   
   /**
       Places either an 'O' or a 'X' on this board using
       the specified row and column.
       @param ch either an 'X' or 'O'
       @param p position on this board to place the character 
   */
   public void register(char ch, Position p)
   {
      int row = p.row();
      int column = p.column();
      board[row][column] = ch; 
   }
   
   /**
       Formats this board.
       @return formatted string of this board
   */
   public String format()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         if (i > 0) { r = r + "-----------\n"; }
         for (int j = 0; j < SIZE; j++)
         {
            if (j > 0) { r = r + "|"; }
            if (!Character.isLetter(board[i][j])) { r = r + "   "; }
            else { r = r + " " + board[i][j] + " "; }
         }
         r = r + "\n";
      }
      
      return r;
   }
   
   public Object clone()
   {
      char[][] copy = Arrays.copyOf(board, SIZE);
      for (int i = 0; i < board.length; i++)
      {
         copy[i] = Arrays.copyOf(board[i], SIZE); 
      }
      
      try
      {
         TicTacToeBoard clonedBoard = (TicTacToeBoard) super.clone();
         clonedBoard.board = copy;
         return clonedBoard;
      }
      catch (CloneNotSupportedException exception)
      {
         System.out.println(exception);
         return null;
      }
   }
   
   /**
       Checks if any row has the same label (all X's or O's)
       @return true if a row has the same label, false otherwise 
   */
   public boolean hasSameRowCharacters()
   {
      boolean found = false;
      int i = 0;
      while (!found && i < SIZE)
      {
         boolean alike = true;
         int j = 0;
         while (alike && j < SIZE - 1)
         {
            if (!Character.isLetter(board[i][j]) 
               || board[i][j] != board[i][j + 1])
            { 
               alike = false;
            }
            else
            {
               j++;
            }
         }
         if (alike) { found = true; }
         else { i++; }
      }
      
      return found;
   }
   
   /**
       Checks if any column has the same label (all X's or O's)
       @return true if a column has the same label, false otherwise
   */
   public boolean hasSameColumnCharacters()
   {
      boolean found = false;
      int j = 0;
      while (!found && j < SIZE)
      {
         boolean alike = true;
         int i = 0;
         while (alike && i < SIZE - 1)
         {
            if (!Character.isLetter(board[i][j]) 
               || board[i][j] != board[i + 1][j])
            { 
               alike = false;
            }
            else
            {
               i++;
            }
         }
         if (alike) { found = true; }
         else { j++; }
      }
      
      return found; 
   }
   
   /**
       Checks the board for any matching diagonals
       @return true if either of both diagonals along the board
       have all X's or O's, false otherwise
   */
   public boolean hasSameDiagonalCharacters()
   {
      if (!Character.isLetter(board[1][1])) { 
         return false; }
      return board[0][0] == board[1][1]
         && board[1][1] == board[2][2]
         || board[0][2] == board[1][1]
         && board[1][1] == board[2][0];
   }
   
   /**
       Checks if this tictactoe board is filled.
       @return true if this board has no empty cell, false
       otherwise
   */
   public boolean isFilled()
   {
      boolean empty = false;
      int i = 0;
      while (!empty && i < SIZE)
      {
         for (int j = 0; j < SIZE; j++)
         {
            if (!Character.isLetter(board[i][j])) { empty = true; }
         }
         i++;
      }
      
      return !empty;
   }
   
   public boolean equals(Object otherObject)
   {
      if (otherObject == null) { 
         return false; }
      if (getClass().getName() != otherObject.getClass().getName())
      {
         return false;
      }
      
      TicTacToeBoard other = (TicTacToeBoard) otherObject;
      
      boolean equals = true;
      for (int i = 0; i < SIZE && equals; i++)
      {
         for (int j = 0; j < SIZE && equals; j++)
         {
            if (board[i][j] != other.board[i][j])
            {
               equals = false;
            }
         }
      }
      
      return equals;
   }
}