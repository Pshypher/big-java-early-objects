public class DataSetTester
{
    public static void main(String[] args)
    {
        DataSet data = new DataSet(100);
        
        double[] scores = { 8, 7, 8.5, 9.5, 7, 5, 10 };
        
        int i = 0;
        while (i < scores.length && data.add(scores[i]))
        {
            i++;
        }
        
        if (i < scores.length) 
        {
            System.out.println("Could not add any more values.");
        }
        
        System.out.println(data.sum());
        System.out.println("Expected: 55");
        System.out.println();
        
        System.out.println(data.average());
        System.out.println("Expected: 7.857");
        System.out.println();
        
        System.out.println(data.maximum());
        System.out.println("Expected: 10");
        System.out.println();
        
        System.out.println(data.minimum());
        System.out.println("Expected: 5");
        
        
    }
}