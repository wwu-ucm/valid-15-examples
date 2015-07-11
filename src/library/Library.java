package library;

import library.contents.Copy;
import library.contents.Medium;
import library.exceptions.NoCopyException;
import library.individuals.User;

import java.util.*;

/**
 * @author vincentvonhof
 */
public class Library {

    private List<User> userList;
    private Map<UUID, Medium> catalogue;
    private Map<UUID, Copy> inventory;
    private Map<UUID, Loan> loans;

    public Library() {
        this.userList = new ArrayList<User>();
        this.catalogue = new HashMap<UUID, Medium>();
        this.inventory = new HashMap<UUID, Copy>();
        this.loans = new HashMap<UUID, Loan>();
    }

    public Library(List<User> userList, Map<UUID, Medium> inventory, Map<UUID, Copy> libraryStash, Map<UUID, Loan> loans) {
        this.userList = userList;
        this.catalogue = inventory;
        this.inventory = libraryStash;
        this.loans = loans;
    }

    public void createMedium(Medium medium) {
        assert catalogue.get(medium.getID()) == null : "We already have information about this Medium.";
        catalogue.put(medium.getID(), medium);
    }

    public Medium getMedium(UUID uuid) {
        return catalogue.get(uuid);
    }

    public void removeMedium(UUID uuid) {
        catalogue.remove(uuid);
    }


    public Copy createCopy(Medium medium) {
        assert getMedium(medium.getID()) != null : "We have no information about this title registered.";

        // Actually create a copy
        Copy copy = new Copy(medium);
        inventory.put(copy.getUniqueID(), copy);

        // Also log how many copy we have of this medium in the medium itself for convenience.
        getMedium(medium.getID()).incrementCount();
        return copy;
    }

    public void removeMedium(Medium medium) throws NoCopyException {
        assert getMedium(medium.getID()) != null : "We have no information about this title registered.";

        // Delete the medium
        inventory.remove(medium.getID());

        // Also log how many copy we have of this medium in the medium itself for convenience.
        getMedium(medium.getID()).decrementCount();
    }

    public void lendItem(Copy copy, User user) {
        assert loans.get(copy.getUniqueID()) == null : "this copy is still marked as borrowed.";
        loans.put(copy.getUniqueID(), new Loan(copy, user, new Date()));
    }

    /**
     * Return a item and calculate fee if applicable.
     *
     * @param copy returned copy
     * @param user returnee
     * @return The fee to be paid by the user in CENTS.
     */
    public int returnCopy(Copy copy, User user) {
        Loan loan = loans.remove(copy.getUniqueID());
        assert loan != null : "this item is not marked as borrowed!";
        final int basicfee = 50;
        return basicfee * loan.extensionCount;
    }
}
