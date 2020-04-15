/**
    This program tests the toString methods of the Person,
    Student and Instructor classes
*/
public class PersonDemo
{
    public static void process(Person p, String major)
    {
        if (p instanceof Student)
        {
            Student std = (Student) p;
            std.setMajor(major);
        }
        
        System.out.println(p);
    }
    
    public static void main(String[] args)
    {
        Person aStudent = new Student("Doe, John", 1995);
        Person another = new Student("Doe, Jane", 1998);
        Person anInstructor = new Instructor("Horstmann, Cay", 1762);
        
        process(aStudent, "Biostatistics");
        process(another, "Mathematics");
        process(anInstructor, "Computer Science");
    }
}