import Model.Book;
import Model.BookManager;
import Model.Date;

import java.time.LocalDate;
import java.util.List;

public class TestHarness {

    public TestHarness() {
        // Instantiate and test the Book class
        testBookClass();

        // Instantiate and test the BookManager class
        testBookManagerClass();
    }

    private void testBookClass() {
        // Instantiate a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", "Physical", "your_cover_url_here");

        // Test the getters and setters
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Format: " + book.getFormat());
        System.out.println("Cover: " + book.getCover());

        // Test the toString method
        System.out.println("Book details: " + book.toString());
    }

    private void testBookManagerClass() {
        // Instantiate a BookManager object
        BookManager bookManager = new BookManager();

        // Test the addBook method
        bookManager.addBook("To Kill a Mockingbird", "Harper Lee", "Fiction", "Ebook", "your_cover_url_here");

        // Test the deleteBook method (assuming there's at least one book in the list)
        List<Book> books = bookManager.getBooks();
        if (!books.isEmpty()) {
            Book bookToDelete = books.get(0);
            bookManager.deleteBook(bookToDelete);
        }

        // Test the trackProgress method (assuming there's at least one book in the list)
        if (!books.isEmpty()) {
            Book bookToTrack = books.get(0);
            Date date = new Date(LocalDate.now(), null); // Assuming the book is starting now
            bookManager.trackProgress(bookToTrack, date, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1));
        }

        // Print the updated book details
        System.out.println("Updated Book List:");
        for (Book book : bookManager.getBooks()) {
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {
        // Instantiate the TestHarness to run the tests
        new TestHarness();
    }
}
