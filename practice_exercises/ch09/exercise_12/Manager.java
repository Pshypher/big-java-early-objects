public class Manager extends Employee
{
    private String department;
    
    /**
        Construct a manager with the given name and an amount
        earned as salary
    */
    public Manager(String name, double amount)
    {
        setName(name);
        setSalary(amount);
    }
    
    /**
        Sets the department under the supervision of this manager.
        @param aDepartment the department handled by this manager
    */
    public void setDepartment(String aDepartment)
    {
        department = aDepartment;
    }
    
    public String toString()
    {
        return super.toString() + "[department=\"" + department + "\"]";
    }
}