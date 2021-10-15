package creational;
import java.io.IOException;
import java.io.PrintStream;

public class CSVBookMetadataExporter extends BookMetadataExporter  {
    protected BookMetadataFormatter format;
    public void export(PrintStream stream) {
        try {
            format = new CSVBookMetadataFormatter();
            for (Book book : books) {
                format.append(book);
            }
            stream.println(format.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
