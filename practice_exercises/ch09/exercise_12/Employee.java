/**
    Employees are identified by their names and earn a salary
*/
public class Employee
{
    private String name;
    private double salary;
    
    /**
        Construct an employee with no name and salary
    */
    public Employee()
    {
        name = "";
        salary = 0;
    }
    
    /**
        Assigns a name to an employee
        @param aName name of employee 
    */
    public void setName(String aName)
    {
        name = aName;
    }
    
    /**
        Sets the amount an employee earns as salary.
        @param amount the salary earned
    */
    public void setSalary(double amount)
    {
        salary = amount;
    }
    
    public String toString()
    {
        return getClass().getName() + "[name=\"" + name + 
                                    "\" salary=" + salary + "]";
    }
}
