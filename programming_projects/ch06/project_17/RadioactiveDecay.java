import java.util.Scanner;

/**
    This program simulates the radioactive decay of the radioisotope
    technetium-99.
*/

public class RadioactiveDecay
{
    public static void main(String[] args)
    {
        final int HALF_LIFE = 6;
        final int HOURS_PER_DAY = 24;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Initial amount of technetium-99: ");
        double initialAmount = in.nextDouble();
        
        for (int time = 1; time <= HOURS_PER_DAY; time++)
        {
            double amount = initialAmount * Math.exp(-time * 
                Math.log(2) / HALF_LIFE);
            System.out.printf("Relative amount (A/A0) at t(%d) is %.4f\n", 
                time, amount / initialAmount);              
        }
    }
}