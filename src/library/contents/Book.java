package library.contents;

import java.util.Date;

/**
 * Created by vincentvonhof on 09.03.15.
 */
public class Book extends Medium {

    private String Author;
    private String LocationOfConception;
    private String Publisher;

    public Book(String title, Date releaseDate, String author, String publisher) {
        super(title, releaseDate);
        Author = author;
        Publisher = publisher;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLocationOfConception() {
        return LocationOfConception;
    }

    public void setLocationOfConception(String locationOfConception) {
        LocationOfConception = locationOfConception;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
