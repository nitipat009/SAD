package creational;
import java.io.PrintStream;
import javax.xml.parsers.ParserConfigurationException;
public class JSONBookMetadataExporter extends BookMetadataExporter  {
    protected BookMetadataFormatter format;
    public void export(PrintStream stream) throws ParserConfigurationException {
        format = new JSONBookMetadataFormatter();
        for (Book book : books) {
            format.append(book);
        }
        stream.println(format.getMetadataString());
    }
}
