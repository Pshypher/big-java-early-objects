/**
   Describes the positions on a tictactoe board
*/
public class Position
{
   private int row;
   private int column;
   
   /**
      Constructs a position at the specified row and column.
      @param rowIndex the row on a tictactoe board
      @param colIndex the column on a tictactoe board
   */
   public Position(int rowIndex, int colIndex)
   {
      row = rowIndex;
      column = colIndex;
   }
   
   /**
      Gets the row index on a tictactoe board.
      @return the row
   */
   public int row()
   {
      return row;
   }
   
   /**
      Gets the column index on a tictactoe board.
      @return the column
   */
   public int column()
   {
      return column;
   }
   
   public boolean equals(Object otherObject)
   {
      if (otherObject == null) { 
         return false; }
      if (getClass().getName() != otherObject.getClass().getName())
      {
         return false;
      }
      
      Position other = (Position) otherObject;
      return other.row == row && other.column == column;
   }
}