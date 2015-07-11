package library;

import library.contents.Copy;
import library.individuals.User;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * A class with Field Access used
 * @author vincentvonhof
 */
public class Loan {
    public Date startDate;
    public Date returnDate;
    public int extensionCount = 0; // THIS IS AN ERROR. Field Access is a bad idea here...
    public static final int MaxExtension = 2;
    public Copy medium;
    public User loaner;

    public Loan(Copy medium, User loaner, Date startDate) {
        this.medium = medium;
        this.loaner = loaner;
        this.startDate = startDate;
        this.returnDate = advanceDateByFourWeeks(this.startDate);
    }

    public Boolean grantExtension() {
        if (extensionCount < MaxExtension) {
            extensionCount++;
            this.returnDate = advanceDateByFourWeeks(this.returnDate);
            return true;
        }
        return false;
    }

    private Date advanceDateByFourWeeks(Date date) {
        Calendar fourWeeksFromNow = new GregorianCalendar();
        fourWeeksFromNow.setTime(date);
        fourWeeksFromNow.set(fourWeeksFromNow.get(Calendar.YEAR),
                fourWeeksFromNow.get(Calendar.MONTH),
                fourWeeksFromNow.get(Calendar.DAY_OF_MONTH));
        fourWeeksFromNow.add(Calendar.MONTH, 1);
        return fourWeeksFromNow.getTime();
    }
}