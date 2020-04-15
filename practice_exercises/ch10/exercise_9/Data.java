package exercise_9;

public class Data
{
    /**
        Computes the average of the measures of the given objects.
        @param objects an array of objects
        @param meas the measurer for the objects
        @return the average of the measures
    */
    public static double average(Object[] objects, Measurer meas)
    {
        double sum = 0;
        for (Object obj : objects)
        {
            sum = sum + meas.measure(obj);
        }
        if (objects.length > 0) { return sum / objects.length; }
        else { return 0; }
    }
    
    /**
        Computes the object with the largest measure.
        @param objects an array of objects
        @param m the measuring object
        @return the object with the largest measure
    */
    public static Object max(Object[] objects, Measurer m)
    {
        Object largest = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            if (m.measure(objects[i]) > m.measure(largest))
            {
                largest = objects[i];
            }
        }
        
        return largest;
    }
}