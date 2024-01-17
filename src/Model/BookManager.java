package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages the book tracking system, including adding, deleting books, and tracking progress.
 */
public class BookManager {
    private List<Book> books;
    private List<Date> dates;
    private List<Review> reviews;

    /**
     * Constructs a new BookManager with empty collections.
     */
    public BookManager() {
        // Initialize collections
        books = new ArrayList<>();
        dates = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    /**
     * Adds a new book to the tracker.
     *
     * @param title  The title of the book.
     * @param author The author of the book.
     * @param genre  The genre of the book.
     * @param format The format of the book (e.g., physical, ebook).
     * @param cover  The URL or path to the cover image of the book.
     */
    public void addBook(String title, String author, String genre, String format, String cover) {
        // Create a new Book object and add it to the books list
        Book newBook = new Book(title, author, genre, format, cover);

        // Create a new Date object and set it as the readingDates for the new book
        Date newDate = new Date(LocalDate.now(), null); // Assuming the book is starting now
        newBook.setReadingDates(newDate);

        // Add the new book to the books list
        books.add(newBook);
    }

    /**
     * Deletes a book from the tracker.
     *
     * @param bookToDelete The book to be deleted.
     */
    public void deleteBook(Book bookToDelete) {
        // Remove the specified book from the books list
        books.remove(bookToDelete);
    }

    /**
     * Tracks the progress of a book by updating its started and finished dates.
     *
     * @param book      The book for which progress is tracked.
     * @param date      The Date object associated with the book.
     * @param started   The date when the book was started.
     * @param finished  The date when the book was finished.
     */
    public void trackProgress(Book book, Date date, LocalDate started, LocalDate finished) {
        // Update the started and finished dates for the specified book
        date.setStarted(started);
        date.setFinished(finished);
    }

    /**
     * Gets the list of books in the tracker.
     *
     * @return The list of books.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Gets the list of dates in the tracker.
     *
     * @return The list of dates.
     */
    public List<Date> getDates() {
        return dates;
    }

    /**
     * Gets the list of reviews in the tracker.
     *
     * @return The list of reviews.
     */
    public List<Review> getReviews() {
        return reviews;
    }
}

