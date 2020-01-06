import java.util.Scanner;

public class MagicSquaresBuilder
{
    /**
        Program written to build and display an odd-sized square 
        matrix that forms a magic square
    */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String prompt = "Enter odd number as size of the magic square: ";
        System.out.print(prompt);
        int size;
        do 
        {
            size = in.nextInt();
            if (size == 1)
            {
                System.out.println("Matrix size ought to be larger than 1.");
                System.out.print(prompt);
            }
            else if (size % 2 == 0)
            {
                System.out.println("Size of matrix shouldn't be even.");
                System.out.print(prompt);
            }
        }
        while (size == 1 || size % 2 == 0); 
        
        int[][] matrix = build(size);
        
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (j > 0)
                {
                    System.out.print(" ");
                }
                System.out.printf("%2d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    /**
        Builds a magic square in form of an n x n matrix
        @return a 2D array of integers
    */
    public static int[][] build(int n)
    {
        int[][] matrix = new int[n][n];
        
        int row = n - 1;
        int column = n / 2;
        for (int k = 1; k <= n * n; k++)
        {
            matrix[row][column] = k;
            int previousRow = row;
            int previousColumn = column;
            row++;
            column++;
            if (row >= n) { row = 0; }
            if (column >= n) { column = 0; }
            if (matrix[row][column] != 0)
            {
                row = previousRow;
                column = previousColumn;
                row--;
            } 
        }
        
        return matrix;
    }
}