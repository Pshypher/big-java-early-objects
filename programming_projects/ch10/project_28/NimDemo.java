public class NimDemo
{
   public static void main(String[] args)
   {
      GamePlayer game = new GamePlayer(new Nim());
      game.start(); 
   }
}