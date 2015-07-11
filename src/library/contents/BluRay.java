package library.contents;

import java.util.Date;
import java.util.List;

/**
 * Created by vincentvonhof on 09.03.15.
 */
public class BluRay extends Medium {

    private Date theatreDate;
    private String director;
    private List<String> actors;
    private List<String> screenwriters;
    private String distributionCompany;
    private String IMDB;

    public BluRay(String title, Date releaseDate, String IMDB) {
        super(title, releaseDate);
        this.IMDB = IMDB;
    }

    public Date getTheatreDate() {
        return theatreDate;
    }

    public void setTheatreDate(Date theatreDate) {
        this.theatreDate = theatreDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getScreenwriters() {
        return screenwriters;
    }

    public void setScreenwriters(List<String> screenwriters) {
        this.screenwriters = screenwriters;
    }

    public String getDistributionCompany() {
        return distributionCompany;
    }

    public void setDistributionCompany(String distributionCompany) {
        this.distributionCompany = distributionCompany;
    }

    public String getIMDB() {
        return IMDB;
    }

    public void setIMDB(String IMDB) {
        this.IMDB = IMDB;
    }
}
