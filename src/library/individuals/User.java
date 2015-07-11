package library.individuals;

import java.util.Date;


/**
 * Created by vincentvonhof on 09.03.15.
 */
public class User {

    private String userID;
    private String name;
    private Date dateOfBirth;

    public User(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
