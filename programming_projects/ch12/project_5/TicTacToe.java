import java.util.ArrayList;
   
   /**
      Describes an instance of a tictactoe game of a human player against
      a computer
   */
public class TicTacToe
{
   public static final int HUMAN = 1;
   public static final int COMPUTER = 2;
   
   private TicTacToeStrategy computer;
   private TicTacToeBoard previous;
   private TicTacToeBoard current;
   private Position currentPostion;
   private int player;
   
   // unoccupied positions on the current tictactoe board
   private ArrayList<Position> positions;
    
   /**
      Constructs an instance of a tictactoe game
   */
   public TicTacToe()
   {
      computer = new TicTacToeStrategy();
      current = new TicTacToeBoard();
      positions = new ArrayList<Position>();
   }
   
   /**
      Changes the state of this tictactoe game when either the
      player or the computer makes a move.
      @param n one of COMPUTER or HUMAN
      @return true if a player's move was valid, false otherwise
   */
   public boolean play(int n)
   {
      player = n;
      boolean played = false;
      char character;
      if (player == HUMAN)
      {
         if (!positions.contains(currentPostion))
         {
            return played;
         }
         else
         {
            character = 'O';
            played = true;
         }
      }
      else
      {
         currentPostion = computer.select(current, positions);
         character = 'X';
         played = true;
      }
      positions.remove(currentPostion);
      previous = (TicTacToeBoard) current.clone();
      current.register(character, currentPostion);
         
      return played;
   }
   
   /**
      Gets the row and column index entered by a human player. 
      @param rowIndex the row index on the tictactoe board
      @param colIndex the column index on the tictactoe board
   */
   public void getPlayerMove(int rowIndex, int colIndex)
   {
      currentPostion = new Position(rowIndex, colIndex);
   }
   
   /**
      Formats the current state of this TicTacToe game, which
      is a string representation of the tictactoe board.
      @return formatted string of the game state
   */
   public String format()
   {
      return current.format();
   }
   
   /**
      Resets this tictactoe game
   */
   public void reset()
   {
      positions.clear();
      for (int i = 0; i < TicTacToeBoard.SIZE; i++)
      {
         for (int j = 0; j < TicTacToeBoard.SIZE; j++)
         {
            positions.add(new Position(i, j));
         }
      }
      
      current = new TicTacToeBoard();
   }
   
   /**
      Checks if there is a winner in the current iteration of
      this tictactoe game.
      @return true if there is a winner or a stalemate, 
      false otherwise
   */
   public boolean hasAWinner()
   {
      boolean hasAWinner = current.hasSameRowCharacters()
         || current.hasSameColumnCharacters()
         || current.hasSameDiagonalCharacters();
      
      if (hasAWinner && player == HUMAN) { computer.addCombination(previous); }
         
      return hasAWinner || current.isFilled();
   }
}