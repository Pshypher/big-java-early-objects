public class TableTester
{
    public static void main(String[] args)
    {   
        Table table = new Table(5, 3);
        
        table.addLine("John Jacob Astor,1763,1848");
        table.addLine("\"William Backhouse Astor, Jr.\",1829,1892");
        table.addLine("\"John Jacob \"\"Jakey\"\" Astor VI\",1912,1992");
        
        System.out.println(table.rows());
        System.out.println("Expected: 3");
        System.out.println(table.columns());
        System.out.println("Expected: 3");
        System.out.println(table.getEntry(1, 1));
        System.out.println("Expected: 1829");
        System.out.println();
        System.out.println("                     Table");
        System.out.println("    -------------------------------------------");
        System.out.println(table);
        
    }
}