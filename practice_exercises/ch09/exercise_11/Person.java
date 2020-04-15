/**
    A person can be identified by their name and
    year of birth
*/
public class Person
{
    private String name;
    private int yearOfBirth;
    
    /**
        Construct a person with no name and year of birth
    */
    public Person()
    {
        name = "";
        yearOfBirth = 0;
    }
    
    /**
        Update the name of this person.
        @param newName the new name
    */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
        Set this person's year of birth 
        @param year the birth year
    */
    public void setYearOfBirth(int year)
    {
        yearOfBirth = year;
    }
    
    public String toString()
    {
        return getClass().getName() + "[name=\"" + name
            + "\" yearOfBirth=" + yearOfBirth + "]";
    }
}