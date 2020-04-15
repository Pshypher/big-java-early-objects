import java.util.Scanner;

public class GameOfLife
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter number of rows: ");
        int rowSize = in.nextInt();
        
        System.out.print("Enter number of columns: ");
        int columnSize = in.nextInt();
        System.out.print("Enter the last generation number: ");
        int last = in.nextInt();
        
        Generation generation = new Generation(rowSize, columnSize);
        
        System.out.println("Enter original configuration, '.' to terminate:");
        String input = in.nextLine();
        int row = 0;
        boolean done = false;
        while (!done)
        {
            input = in.nextLine();
            row++;
           
            if (!generation.fill(input, row))
            {
                System.out.println("Cannot fill grid with rows any longer.");
                return;
            }
            
            if (input.endsWith(".")) { done = true; }
            
        }
        
        for (int current = 0; current < last; current++)
        {
            System.out.println(generation);
            
            String label = "Generation " + current;
            
            // align the label of the generation to the centre
            int spaces = (columnSize - label.length()) / 2; 
            for (int i = 1; i <= spaces; i++)
            {
                System.out.print(" ");
            }
            System.out.println("Generation " + current);
            
            // call generation method to determine the configuration 
            // of the next generation
            generation.nextGeneration();
        }
    }
}