/**
        An object-oriented approach to a "Hello, World" program
*/
public class Greeter
{
        private String name;
        /**
                Constructs a new Greeter object
        */
        public Greeter(String firstName)
        {
                name = firstName;
        }
        
        /**
                Returns a string that greets the user who invokes the method
                @return a string that says hello
        */
        public String sayHello()
        {
                return "Hello, ".concat(name);
        }
        
        /**
                Returns a string that greets a user who invokes the method
                @return a string that says goodbye
        */
        public String sayGoodbye()
        {
                return "Good bye, ".concat(name);
        }
        
        /**
                Returns a string with a certain name in it, telling a person  it is refusing to render help
                @return a string saying it is refusing to help the addressed person
        */
        public String refuseHelp()
        {
                return "I am sorry, ".concat(name).concat(". I am afraid I can't do that.");
        }
} 