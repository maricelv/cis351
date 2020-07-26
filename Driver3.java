/**
 * A driver for testing the FormattedDocument class
 */
public class Driver3
{
    /**
     * The entry point of the application
     *
     * @param args   The command line arguments
     * @author Maricel Vicente
     */
    public static void main(String[] args)
    {
 Document        formatted;
 String                   text;


 text = "George is a little monkey, "+
               "and all monkeys are curious.\n"+
               "But no monkey is as curious "+
               "as George.";


 formatted = new FormattedDocument(text, 20);

        print(formatted);        
    }

    /**
     * Print a Document
     */
    private static void print(Document doc)
    {
 System.out.println("A document:");
 System.out.println();
 System.out.println(doc.getText());
 System.out.println("\n");
    }

    /**
     * Print a FormattedDocument
     */
    private static void print(FormattedDocument doc)
    {
 System.out.println("A nicely formatted document:");
 System.out.println();
 System.out.println(doc.getText());
 System.out.println("\n");
    }
}