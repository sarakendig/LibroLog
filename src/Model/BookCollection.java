package Model;

/**
 * Represents a collection of books categorized as currently reading, want to read, and already read.
 */
public class BookCollection {
    private String currentlyReading;
    private String wantToRead;
    private String alreadyRead;

    /**
     * Constructs a new BookCollection with the specified categories.
     *
     * @param currentlyReading The category for currently reading books.
     * @param wantToRead       The category for books the user wants to read.
     * @param alreadyRead      The category for books already read.
     */
    public BookCollection(String currentlyReading, String wantToRead, String alreadyRead) {
        this.currentlyReading = currentlyReading;
        this.wantToRead = wantToRead;
        this.alreadyRead = alreadyRead;
    }

    /**
     * Gets the category for currently reading books.
     *
     * @return The category for currently reading books.
     */
    public String getCurrentlyReading() {
        return currentlyReading;
    }

    /**
     * Sets the category for currently reading books.
     *
     * @param currentlyReading The new category for currently reading books.
     */
    public void setCurrentlyReading(String currentlyReading) {
        this.currentlyReading = currentlyReading;
    }

    /**
     * Gets the category for books the user wants to read.
     *
     * @return The category for books the user wants to read.
     */
    public String getWantToRead() {
        return wantToRead;
    }

    /**
     * Sets the category for books the user wants to read.
     *
     * @param wantToRead The new category for books the user wants to read.
     */
    public void setWantToRead(String wantToRead) {
        this.wantToRead = wantToRead;
    }

    /**
     * Gets the category for books already read.
     *
     * @return The category for books already read.
     */
    public String getAlreadyRead() {
        return alreadyRead;
    }

    /**
     * Sets the category for books already read.
     *
     * @param alreadyRead The new category for books already read.
     */
    public void setAlreadyRead(String alreadyRead) {
        this.alreadyRead = alreadyRead;
    }

    /**
     * Returns a string representation of the BookCollection.
     *
     * @return A string representation of the BookCollection.
     */
    @Override
    public String toString() {
        return "BookCollection{" +
                "currentlyReading='" + currentlyReading + '\'' +
                ", wantToRead='" + wantToRead + '\'' +
                ", alreadyRead='" + alreadyRead + '\'' +
                '}';
    }
}

