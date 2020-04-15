package project_19;

/**
    This class models the current state of a tictactoe
    board.
*/
public class TicTacToeBoard
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
       @param label either an 'X' or 'O'
       @param row the row in this board
       @param column the column position
       @return true if the position is unocuppied, false otherwise 
   */
   public boolean register(char label, int row, int column)
   {
      if (!Character.isLetter(board[row][column]))
      {
         board[row][column] = label; 
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
       Checks if the given position within the board is empty
       @param row the row in this board
       @param column column within the given row 
       @return true if it is unoccupied, false otherwise
   */
   public boolean empty(int row, int column)
   {
      return !Character.isLetter(board[row][column]);
   }
   
   /**
       Displays the current state of this board.
   */
   public void display()
   {
      for (int i = 0; i < SIZE; i++)
      {
         if (i > 0)
         {
            System.out.println("-----------");
         }
         for (int j = 0; j < SIZE; j++)
         {
            if (j > 0) { System.out.print("|"); }
            if (board[i][j] == ' ') 
            {
               System.out.print("   ");
            }
            else 
            {
               System.out.print(" " + board[i][j] + " ");
            }
         }
         System.out.println();
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
   public boolean filled()
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
   
   /**
     Get the number of rows in this tictactoe board.
     @return the number of rows
   */
   public int getRowSize()
   {
      return board.length;
   }
   
   /**
     Get the number of columns in this tictactoe board.
     @return the number of columns
   */
   public int getColumnSize()
   {
      return board[0].length;
   }
   
   /**
     Get the character at the specified row and column in this board.
     @param row position of the row
     @param column position of the column
   */
   public char getChar(int row, int column)
   {
      return board[row][column];
   }
   
  /**
     Removes all X and O characters from this tictactoe board.
  */
   public void clear()
   {
      board = new char[SIZE][SIZE];  
   }
}