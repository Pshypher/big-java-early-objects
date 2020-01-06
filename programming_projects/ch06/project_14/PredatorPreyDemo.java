import java.util.Scanner;

/**
    This program simulates a predator-prey interaction and computes
    the predator and prey population after some period i.
*/
public class PredatorPreyDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Initial prey population: ");
        int preyPopulation = in.nextInt();
        
        System.out.print("Initial population of predators: ");
        int predatorPopulation = in.nextInt();
        
        System.out.print("Numbers of periods: ");
        int period = in.nextInt();
    
        System.out.print("Birth rate (prey): ");
        double preyBirthRate = in.nextDouble();
        System.out.print("Predation rate: ");
        double predationRate = in.nextDouble();
        System.out.print("Predator decrease due to starvation: ");
        double predatorDeathRate = in.nextDouble();
        System.out.print("Predator increase: ");
        double predatorBirthRate = in.nextDouble();
        
        for (int i = 1; i <= period; i++)
        {
            preyPopulation = (int) (preyPopulation * (1 + 
                preyBirthRate - predationRate * predatorPopulation));
            predatorPopulation = (int) (predatorPopulation * (1 - 
                predatorDeathRate + predatorBirthRate * preyPopulation))3.78;                 
        }
        System.out.println("Prey population " + preyPopulation);
        System.out.println("Predator population " + predatorPopulation);
    }
}