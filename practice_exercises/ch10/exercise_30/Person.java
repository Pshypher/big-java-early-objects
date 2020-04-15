/**
    A person can be identified by their name.
*/
public class Person implements Comparable
{
    private String name;
    
    /**
        Construct a person object with the given name.
        @param aName the name 
    */
    public Person(String aName)
    {
        name = aName;
    }
    
    /**
        Get the name of this person.
        @return the name
    */
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Object otherObject)
    {
        Person other = (Person) otherObject;
        return name.compareTo(other.name);
    }
}