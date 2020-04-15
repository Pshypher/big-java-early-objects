import java.util.ArrayList;

/**
    GradeBook class is a collection of all student grades
*/
public class GradeBook
{
    private ArrayList<Student> allStudents; 
    
    /**
        Construct an empty grade book with no student.
    */
    public GradeBook()
    {
        allStudents = new ArrayList<Student>();
    }
    
    
    /**
        Add a student to this GradeBook.
        @param aStudent student object added to grade book.
    */
    public void addStudent(Student aStudent)
    {
        allStudents.add(aStudent);
    }
    
    /**
        Returns all the allStudents in this GradeBook
        @return an array list of student objects 
    */
    public ArrayList<Student> getStudents()
    {
        return allStudents;
    }
    
    /**
        Returns a String representation of this grade book.
        @return a String displaying the neccessary details 
        within this grade book.
    */
    public String toString()
    {
        String out = "";
        out = out + "Student Names       Scores\n";
        for (Student std : allStudents)
        {
            out = out + String.format("%-20s%4.2f",
                    std.getName(), std.finalScore());
            out = out + "\n";   
        }
        return out;
    }
}