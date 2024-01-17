package Model;


/**
 * Represents a book in the book tracking system.
 */
public class Book {

    private String title;
    private String author;
    private String genre;
    private String format;
    private String cover;
    private Date readingDates;


    /**
     * Constructs a new Book object with the specified details.
     *
     * @param title   The title of the book.
     * @param author  The author of the book.
     * @param genre   The genre of the book.
     * @param format  The format of the book (e.g., physical, ebook).
     * @param cover   The URL or path to the cover image of the book.
     */
    public Book(String title, String author, String genre, String format, String cover) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.format = format;
        this.cover = cover;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the genre of the book.
     *
     * @return The genre of the book.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the book.
     *
     * @param genre The new genre of the book.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets the format of the book.
     *
     * @return The format of the book.
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the format of the book.
     *
     * @param format The new format of the book.
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Gets the cover URL or path of the book.
     *
     * @return The cover URL or path of the book.
     */
    public String getCover() {
        return cover;
    }

    /**
     * Sets the cover URL or path of the book.
     *
     * @param cover The new cover URL or path of the book.
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Gets the reading dates associated with the book.
     *
     * @return The reading dates associated with the book.
     */
    public Date getReadingDates() {
        return readingDates;
    }

    /**
     * Sets the reading dates associated with the book.
     *
     * @param readingDates The new reading dates associated with the book.
     */
    public void setReadingDates(Date readingDates) {
        this.readingDates = readingDates;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return A string representation of the book.
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", format='" + format + '\'' +
                ", cover='" + cover + '\'' +
                ", readingDates=" + readingDates +
                '}';
    }
}
