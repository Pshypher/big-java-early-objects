/**
    A student can be identified by their names, year of birth
    and their major in school.
*/
public class Student extends Person
{
    private String major;
    
    /**
        Construct a student with the given name and year of
        birth and no major.
        @param name name of this student
        @param year student's year of birth
    */
    public Student(String name, int year)
    {
        setName(name);
        setYearOfBirth(year);
        major = "";
    }
    
    /**
        Select a major available within the school for this student.
        @param major the selected major
        
    */
    public void setMajor(String major)
    {
        this.major = major;
    }
    
    public String toString()
    {
        return super.toString() + "[major=" + major + "]";
    }
}