/**
    An instructor can be identified by their name, year of birth
    and earns an income
*/
public class Instructor extends Person
{
    private double salary;
    
    /**
        Construct an instructor with a name, year of birth
        and no annual income
    */
    public Instructor(String name, int year)
    {
        setName(name);
        setYearOfBirth(year);
        salary = 0;   
    }
    
    /**
        Set the base salary of this instructor
        @param income annual income of this instructor
    */
    public void setBaseSalary(double income)
    {
        salary = income;
    }
    
    public String toString()
    {
        return super.toString() + "[salary=" + salary + "]";
    }
}