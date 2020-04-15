public class GamePlayer
{
   private Game game;
   
   public GamePlayer(Game boardGame)
   {
      game = boardGame;
   }
   
   public void start()
   {
      while (!game.isGameOver())
      {
         game.display();
         String move = game.prompt();
         if (game.isValidMove(move))
         {
            game.executeMove(move);
            game.toggle();
         }
      }
      game.toggle();
      System.out.println(game.winner());
   }
}