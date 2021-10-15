package creational;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

public class Main {

    public static void main(String[] args) throws IOException,ParserConfigurationException {

        // Current usage
        System.out.println("################TASK 1########################"); //Serapate
        BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("################TASK 2########################"); //Serapate
        // Expected usage
       BookMetadataExporter exporter = new XMLBookMetadataExporter();
       exporter.add(TestData.sailboatBook);
       exporter.add(TestData.GoFBook);
       exporter.export(System.out);
    }
}
