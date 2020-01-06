import java.util.Scanner;

public class BarChartDemo
{
    public static void main(String[] args)
    {
        BarChart barChart = new BarChart(100);
        Scanner in = new Scanner(System.in);
        
        //{ Egypt 30, France 55, Japan 39, Uruguay 36, Switzerland 19 }
        System.out.print("Enter each caption, succeeded by lengths ");
        System.out.println("of each bar;");
        System.out.println("    (e.g. France 55, Japan 39), Q to quit:");
        String caption;
        while(!(caption = in.next()).equals("Q"))
        {
            int length = in.nextInt();
            Bar bar = new Bar(caption, length); 
            if (!barChart.add(bar))
            {
                System.out.println("No more bars can be added");
                return;
            }
        }
        
        System.out.println();
        barChart.display();
    }
}