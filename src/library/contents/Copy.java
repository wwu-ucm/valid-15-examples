package library.contents;

import java.util.UUID;

/**
 * @author vincentvonhof
 */
public class Copy  {

    private UUID uuid;
    private Medium medium;

    public Copy(Medium medium) {
        this.medium = medium;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUniqueID() {
        return uuid;
    }
}
