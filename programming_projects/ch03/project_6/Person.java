/**
        A class to model a Person
*/
public class Person
{
        private String name;
        private String friends;
        private int friendCount;
        
        /**
                Constructs a Person object
        */
        public Person(String aName)
        {
                name = aName;
                friends =  "";
        }
        
        /**
                Become friends with another Person
                @param p a Person to become friends with
        */
        public void befriend(Person p)
        {
                friends = friends+ " " + p.name;
                friendCount = friendCount + 1;
        }
        
        /**
                A Person ceases to be friends with another once this method is called
                @param p the person to cease being friends with
        */
        public void unfriend(Person p)
        {
        
        }
        
        /**
                Returns the first names of the friends of a Person
                @return the names of the friends of a Person
        */
        public String getFriendNames()
        {
                return friends;
        }
        
        /**
                Counts and returns the number friends a Person has
                @return the number of friends a person has
        */
        public int getFriendCount()
        {
                return friendCount;
        }
}