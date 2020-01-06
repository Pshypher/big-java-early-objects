public class Mark
{
    private char mark;
    
    /**
        Constructs an X, O mark or one with an empty space
        @param tictactoeMark either one of the X ,O or a space char 
    */
    public Mark(char tictactoeMark)
    {
        mark = tictactoeMark;
    }
    
    /**
        Get the character used to mark the grid
        @return char that marks a grid
    */
    public char getChar()
    {
        return mark;
    }
    
    /**
        String representation of this Mark
        @return a String
    */
    public String toString()
    {
        return Character.toString(mark);
    }
}