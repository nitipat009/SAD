package creational;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;
public class XMLBookMetadataExporter extends BookMetadataExporter {

    protected BookMetadataFormatter format;
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        try {
            format = new XMLBookMetadataFormatter();
            for (Book book : books) {
                format.append(book);
            }
            stream.println(format.getMetadataString());
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        
    }

}
