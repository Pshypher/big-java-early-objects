import java.util.Scanner;

/**
    This program determines the turns ratio of coils in a 
    transformer that maximizes the power delivered to a 
    speaker from an amplifier
*/
public class AudioCircuitDemo
{
    public static void main(String[] args)
    {
        final double TURNS_RATIO_LIMIT = 2.0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Potential difference of the circuit: ");
        double voltage = in.nextDouble();
        System.out.print("Initial resistance: ");
        double initialResistance = in.nextDouble();
        System.out.print("Resistance at the end of the circuit: ");
        double resistance = in.nextDouble();
        
        
        double mostEfficientTurnsRatio = 0.01;
        double maxPower = resistance * Math.pow(mostEfficientTurnsRatio
            * voltage / (mostEfficientTurnsRatio * mostEfficientTurnsRatio 
            * initialResistance + resistance), 2);
        double turnsRatio = 0.02;
        while (turnsRatio <= TURNS_RATIO_LIMIT)
        {
            double power = resistance * Math.pow(turnsRatio
                * voltage / (turnsRatio * turnsRatio * initialResistance
                + resistance), 2);
            if (power > maxPower)
            {
                mostEfficientTurnsRatio = turnsRatio;
                maxPower = power;
            }
            turnsRatio = turnsRatio + 0.01;
        } 
        System.out.printf("%.2f\n", mostEfficientTurnsRatio);
    }
}