package ch10.exercise_3;

/**
    This program tests the Person class
*/
public class MeasurableTester
{
    public static void main(String[] args)
    {
        Measurable[] persons = new Measurable[3];
        persons[0] = new Person("Morgan, Harry", 132.66);
        persons[1] = new Person("Lin, Sally", 173.41);
        persons[2] = new Person("Doe, John", 144.52);
    
        double averageHeight = Data.average(persons);
        System.out.printf("Average height: %.2f\n", averageHeight);
        System.out.println("Expected: 150.19");
        
        Measurable meas = Data.max(persons);
        Person tallest = (Person) meas;
        
        String name = tallest.getName();
        System.out.println("Tallest person: " + name);
        System.out.println("Expected: Lin, Sally");
        
        double height = tallest.getHeight();
        System.out.println("Height: " + height);
        System.out.println("Expected: 173.41");
    }
}