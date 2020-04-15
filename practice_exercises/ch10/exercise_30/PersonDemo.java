import java.util.Arrays;
import java.util.Scanner;

/**
    This program demonstrates the implementation of the
    Comparable interface in the Person class
*/
public class PersonDemo
{
    public static void main(String[] args)
    {
        Person[] persons = new Person[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the names of ten persons:");
        for (int i = 0; i < persons.length; i++)
        {
            String name = in.next();
            persons[i] = new Person(name);
        }
        
        Arrays.sort(persons);
        Person first = persons[0];
        Person last =  persons[persons.length - 1];
        System.out.println("First: " + first.getName());
        System.out.println("Last: " + last.getName());   
    }
}