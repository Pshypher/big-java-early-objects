import java.util.ArrayList;
import java.util.Random;

/**
   This class contains several tictactoe board combinations used 
   to teach a computer how make a smart move 
*/
public class TicTacToeStrategy
{
   public static final char LETTER = 'X';
   
   private ArrayList<TicTacToeBoard> combinations;
   
   /**
      Constructs a computer program object capable of playing a  
      game of tictactoe.
   */
   public TicTacToeStrategy()
   {
      combinations = new ArrayList<TicTacToeBoard>();
   }
   
   /**
      Selects a position on the given tictactoe board.
      @param b the tictactoe board
      @param positions set of unoccupied positions on the
      tictactoe board 
      @return the selected position
   */
   public Position select(TicTacToeBoard b, ArrayList<Position> positions)
   {  
      Random generator = new Random();
      TicTacToeBoard clonedBoard = (TicTacToeBoard) b.clone();
      ArrayList<Position> copy = new ArrayList<Position>(positions);
      
      while (copy.size() > 0)
      {
         int choice = generator.nextInt(copy.size());
         Position p = copy.get(choice);
         clonedBoard.register(LETTER, p); 
         if (!contains(clonedBoard)) { 
            return p; }
         else { copy.remove(p); }
      }
      
      int choice = generator.nextInt(positions.size());
      return positions.get(choice);
   }
   
   /**
      Adds a losing combination to this object
      @param b instance of a tictactoe board that yields
      a possible losing combination
   */
   public void addCombination(TicTacToeBoard b)
   {
      TicTacToeBoard clonedBoard = (TicTacToeBoard) b.clone();
      combinations.add(clonedBoard);
   }
   
   /**
      Checks if a given combination is one of the added possible
      losing combinations
      @param board instance of a tictactoe board with zero
      or more X or O label(s) placed
   */
   public boolean contains(TicTacToeBoard board)
   {
      boolean found = false;
      for (int i = 0; i < combinations.size() && !found; i++)
      { 
         if (board.equals(combinations.get(i)))
         {
            found = true;
         }
      }
      
      return found;
   }
}