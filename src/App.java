import Model.Book;
import Model.BookManager;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        // Instantiate the BookManager
        BookManager bookManager = new BookManager();

        // Example: Adding a new book
        bookManager.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Classic", "Physical", "your_cover_url_here");

        // Example: Adding another book
        bookManager.addBook("To Kill a Mockingbird", "Harper Lee", "Fiction", "Ebook", "your_cover_url_here");

        // Example: Tracking progress for a book
        Book bookToTrack = bookManager.getBooks().get(0); // Assuming there is at least one book
        bookManager.trackProgress(bookToTrack, bookToTrack.getReadingDates(), LocalDate.of(2022, 1, 1), LocalDate.of(2022, 2, 1));

        // Example: Deleting a book
        Book bookToDelete = bookManager.getBooks().get(1); // Assuming there is at least one more book
        bookManager.deleteBook(bookToDelete);

        // Print the updated book details
        System.out.println("Updated Book List:");
        for (Book book : bookManager.getBooks()) {
            System.out.println(book.toString());
        }
    }
}

