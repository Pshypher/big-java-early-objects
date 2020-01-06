public interface ISegment
{
    void split(String plainText);
    String getTag(String text);
    String toHTML();
}