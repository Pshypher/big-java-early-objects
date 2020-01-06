public class Executive extends Manager
{
    public Executive(String name, double amount, String department)
    {
        super(name, amount);
        setDepartment(department);
    }
    
    public String toString()
    {
        return super.toString();
    }
}