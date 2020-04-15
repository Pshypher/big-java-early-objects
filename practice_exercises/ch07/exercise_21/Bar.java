public class Bar
{
    private String title;
    private int length;
    
    /**
        Constructs a Bar with a title and size.
        @param title the caption of this Bar
        @param length the size of this Bar. 
    */
    public Bar(String title, int length)
    {
        this.title = title;
        this.length = length;
    }
    
    /**
        Get the magnitude of this Bar
        @return int this Bar's size
    */
    public int getLength()
    {
        return length;
    }
    
    /**
        Fetches the title of this Bar 
        @return String the title
    */
    public String getCaption()
    {
        return title;
    }
}