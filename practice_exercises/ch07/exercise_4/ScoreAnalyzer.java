import java.util.Scanner;

/**
    This program computes a final score for a series of quiz scores: the sum after dropping 
    the lowest score. The program adapts the algorithm for computing the minimum.
*/
public class ScoreAnalyzer
{
    public static void main(String[] args)
    {
        Student fred = new Student(100);
        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble())
        {  
            if (!fred.addScore(in.nextDouble()))
            {
                System.out.println("Too many scores.");
                return;
            }
        }

        int pos = fred.minimumPosition();
        if (pos == -1)
        {
            System.out.println("At least one score is required.");
        }
        else
        {
            fred.removeMin();
            double total = fred.sum();
            System.out.println("Final score: " + total);
        }
    }
}

