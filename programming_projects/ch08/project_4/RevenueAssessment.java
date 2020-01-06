public class RevenueAssessment
{
    public static void main(String[] args)
    {
        final int OCCURRENCE = 1000;
        Simulation simulation = new Simulation();
        simulation.setup();
        simulation.loadPassengers();
        double sum = 0;
        for (int i = 0; i < OCCURRENCE; i++)
        {
            simulation.driveCars();
            sum = sum + simulation.getRevenuePerMile();
        }
        
        double average = sum / OCCURRENCE;
        System.out.printf("Average revenue per mile is %.4f ", average);
    }
}