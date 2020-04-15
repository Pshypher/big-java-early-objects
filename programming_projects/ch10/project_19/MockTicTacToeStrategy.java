package project_19;

public class MockTicTacToeStrategy implements ITicTacToeStrategy
{
    public void move(TicTacToeBoard board)
    {
        boolean found = false;
        int i = 0;
        while (!found && i < TicTacToeBoard.SIZE)
        {
            int j = 0;
            while (!found && j < TicTacToeBoard.SIZE)
            {
                if (board.empty(i, j))
                {
                    board.register('O', i, j);
                    found = true;
                    System.out.printf("Computer moves to [%d][%d]\n", i, j);
                }
                else
                {
                    j++;
                }
            }
            i++;
        }
    }
}