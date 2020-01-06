/**
   Describes an object of a board game.
*/
public interface Game
{

   /**
      Prompts player of the game for a move.
      @return the move entered
   */
   String prompt();
   
   /**
      Checks the move made by a player.
      @param move a player's move
      @return true if the move is valid, false otherwise
   */
   boolean isValidMove(String move);
   
   /**
      Each player moves changes the state of the
      board game
      @param move a player's move
   */
   void executeMove(String move);
   
   /**
      Checks whether the game is in its final state
      @return true if the game can no longer be played, 
      false otherwise
   */
   boolean isGameOver();
   
   /**
      Displays the current state of this board game.
   */
   void display();
   
   /**
      Switches between players in a game.
   */
   void toggle();
   
   /**
      Gets the winner of an instance of a game.
      @return the winner
   */
   String winner();
}  