public class Student
{
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    
    private String name;
    private int status;
    
    /**
        Constructor of a student assistant with the given name,
        amount earned per hour and hours worked for.
        @param aName name of this student.
        @param aStatus marital status of a student assistant.
    */
    public Student(String aName, int aStatus)
    {
        name = aName;
        status = aStatus; 
    }
    
    /**
        Get the name of student assistant.
        @return the name of this student assistant
    */
    public String getName()
    {
        return name;
    }
    
    /**
        Get the marital status of this assistant.
        @return 1 for single assistants, 2 for married
        assistants.
    */
    public int getStatus()
    {
        return status;
    }
    
}