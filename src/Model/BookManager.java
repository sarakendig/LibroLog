package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;
    private List<Date> dates;
    private List<Review> reviews;

    public BookManager() {
        // Initialize collections
        books = new ArrayList<>();
        dates = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    public void addBook(String title, String author, String genre, String format, String cover) {
        // Create a new Book object and add it to the books list
        Book newBook = new Book(title, author, genre, format, cover);
        books.add(newBook);
    }

    public void deleteBook(Book bookToDelete) {
        // Remove the specified book from the books list
        books.remove(bookToDelete);
    }

    public void trackProgress(Book book, Date date, LocalDate started, LocalDate finished) {
        // Update the started and finished dates for the specified book
        date.setStarted(started);
        date.setFinished(finished);
    }

    // Getters for accessing the lists
    public List<Book> getBooks() {
        return books;
    }

    public List<Date> getDates() {
        return dates;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
