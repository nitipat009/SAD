package creational;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject result,BookDetail;
    private JSONArray Books;
    private JSONArray authors;
    
    public JSONBookMetadataFormatter() {
        reset();
    }
    
    
    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        Books = new JSONArray();
        result = new JSONObject();

        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        BookDetail = new JSONObject();
        authors = new JSONArray();
        BookDetail.put("ISBN",b.getISBN());
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        BookDetail.put("Authors", authors);
        //BookDetail.put("Authors", b.getAuthors());
        BookDetail.put("Title",b.getTitle());
        BookDetail.put("Publisher", b.getPublisher());
        Books.add(BookDetail);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        result.put("Books",Books);
        return result.toString();
    }
}
