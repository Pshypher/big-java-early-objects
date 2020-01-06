package ch10.exercise_3;

/**
    A person has a name and height in centimeters
*/
public class Person implements Measurable
{
    private String name;
    private double height;
    
    /**
        Construct a person with a name and height
        @param aName name of person
        @param theHeight the height
    */
    public Person(String aName, double theHeight)
    {
        name = aName;
        height = theHeight;
    }
    
    /**
        Get the name of this person.
        @return the name
    */
    public String getName()
    {
        return name;
    }
    
    /**
        Compute this person's height
        @return the height
    */
    public double getHeight()
    {
        return height;
    }
    
    /**
        Increase the height of this person by some amount
        @param amount quantity added to the height
    */
    public void increase(double amount)
    {
        height = height + amount;
    }
    
    public double getMeasure()
    {
        return height;
    }
}