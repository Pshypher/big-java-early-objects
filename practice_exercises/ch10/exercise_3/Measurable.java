package ch10.exercise_3;

/**
    Describes any class whose objects can be measured.
*/
public interface Measurable
{
    /**
        Computes the measure of the object.
        @return the measure
    */
    double getMeasure();
    
    /**
        Finds the largest element in an array of measurable
        objects.
        @param objects an array of measurable elements
        @return the largest measurable element
    */
    static Measurable largest(Measurable[] objects)
    {
        Measurable largestObj = objects[0];
        for (int i = 1; i < objects.length; i++)
        {
            Measurable currentObj = objects[i];
            if (currentObj.getMeasure() > largestObj.getMeasure())
            {
                largestObj = currentObj;
            }
        }
        
        return largestObj;
    }
    
    /**
        Finds the smallest element in an array of measurable
        objects.
        @param objects an array of measurable elements
        @return the smallest measurable object
    */
    static Measurable smallest(Measurable[] objects)
    {
        Measurable smallestObj = objects[0];
        
        for (int i = 0; i < objects.length; i++)
        {
            Measurable currentObj = objects[i];
            if (currentObj.getMeasure() < smallestObj.getMeasure())
            {
                smallestObj = currentObj;
            }
        }
        
        return smallestObj;
    }
}
