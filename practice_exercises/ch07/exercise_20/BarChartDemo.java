import java.util.Scanner;

public class BarChartDemo
{
    public static void main(String[] args)
    {
        BarChart barChart = new BarChart(100);
        Scanner in = new Scanner(System.in);
        
        // bar chart values ==> { 30, 55, -39, 36, -19 }
        System.out.println("Enter the lengths of each bar, Q to quit:");
        while(in.hasNextInt())
        {
            if (!barChart.add(in.nextInt()))
            {
                System.out.println("No more values can be added");
                return;
            }
        }
        
        barChart.display();
    }
}