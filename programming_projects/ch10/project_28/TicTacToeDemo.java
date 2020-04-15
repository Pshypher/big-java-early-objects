public class TicTacToeDemo
{
   public static void main(String[] args)
   {
      GamePlayer game = new GamePlayer(new TicTacToe());
      game.start(); 
   }
}