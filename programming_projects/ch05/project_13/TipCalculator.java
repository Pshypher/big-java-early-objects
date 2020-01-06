import java.util.Scanner;

/**
        This program calculates the tip at a restaurant according to
        the service diners receive
*/
public class TipCalculator
{
        public static void main(String[] args)
        {
                final int TOTALLY_SATISFIED = 1;
                final int SATISFIED = 2;
                final int DISSATISFIED = 3;
                
                final double SERVICE_TIP_RATE1 = 0.20;
                final double SERVICE_TIP_RATE2 = 0.15;
                final double SERVICE_TIP_RATE3 = 0.10;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the cost of meal: ");
                double cost = in.nextDouble();
                
                System.out.print("Please enter satisfaction level (1 Totally satisfied "
                        + "2 Satisfied and 3 Dissatisfied): ");
                int level = in.nextInt();                        
                
                if (level < TOTALLY_SATISFIED && level > DISSATISFIED)
                        System.out.println("Error: Satisfication Level is at least 1 and at most 3");
                else
                {
                        double serviceTip;
                        if (level == TOTALLY_SATISFIED)
                                serviceTip = cost * SERVICE_TIP_RATE1;
                        else if (level == SATISFIED)
                                serviceTip = cost * SERVICE_TIP_RATE2;
                        else
                                serviceTip = cost * SERVICE_TIP_RATE3;
                        
                        System.out.println("Satisfaction level: " + level);
                        System.out.printf("Service Tip:        %.2f", serviceTip);                                     
                }             
        }
}