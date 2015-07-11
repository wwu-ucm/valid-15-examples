package library.contents;

import library.exceptions.NoCopyException;

import java.util.Date;
import java.util.UUID;

/**
 * @author vincentvonhof
 */
public abstract class Medium {

    private UUID ID;
    private String title;
    private Date releaseDate;

    // Counts how many instances of this medium we own.
    private int count = 0;

    /**
     * @param title       title
     * @param releaseDate releasedate
     */
    public Medium(String title, Date releaseDate) {
        this.ID = UUID.randomUUID();
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getCount() {
        return this.count;
    }

    public UUID getID() {
        return ID;
    }

    public void incrementCount() {
        this.count++;
    }

    public void decrementCount() throws NoCopyException {
        if (this.count > 0) {
            this.count--;
        } else
            throw new NoCopyException("We do not have any physical Mediums, so we cannot remove any!");
    }

}
