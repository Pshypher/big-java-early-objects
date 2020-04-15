package ch10.exercise_3;

public class Data
{
    /**
        Computes the average of the measures of the given objects.
        @param objects an array of Measurable objects
        @return the average of the measures
    */
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) { return sum / objects.length; }
        else { return 0; }
    }
    
    /**
        Computes the largest of all the Measurable objects.
        @param an array of Measurable objects
        @return the largest object in the array
    */
    public static Measurable max(Measurable[] objects)
    {
        Measurable largest = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            Measurable obj = objects[i];
            if (largest.getMeasure() < obj.getMeasure())
            {
                largest = obj;
            } 
        }
        
        return largest;
    }
}
