/**
        A class used to author a simple Letter        
*/
public class Letter 
{
        private String author;
        private String recipient;
        private String body;
       
        /**
                Constructs a simple letter from an author to the recipient
                @param from the name of the author
                @param to the name of the recipient
        */
        public Letter(String from, String to)
        {
                author = from;
                recipient =  to;
                body = "Dear ".concat(recipient).concat(":\n\n");
        }
        
        /**
                Adds a line to the body of the letter
                @param line contains the characters to be added to the body of the letter
        */
        public void addLine(String line)
        {
                body = body.concat(line).concat("\n");
        }
        
        /**
                Returns the entire textof the letter
                @return the entire text of the letter
        */
        public String getText()
        {
                body = body.concat("Sincerely,").concat("\n\n").concat(author);
                return body;
        }
}