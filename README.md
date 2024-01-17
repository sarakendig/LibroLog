# Book Tracker App

## Overview

The Book Tracker App is a Java-based CRUD application designed to help users keep track of the books they've read, want to read, and are currently reading. The application provides functionalities to add, delete, and track reading progress, as well as capture details such as covers and reviews.

## Classes

1. **Book Class**
   - Attributes: `title` (String), `author` (String), `genre` (String), `format` (String), `cover` (String)
   - Methods:
     - Constructor: Initializes `title`, `author`, `genre`, `format` and `cover`.
     - Getters and setters for `title`, `author`,  `genre`, `format` and `cover`.
     - `toString`: Returns a string representation of the book details.

2. **Date Class**
   - Attributes: `started` (Date), `finished` (Date)
   - Methods:
     - Constructor: Initializes `started` and `finished` dates.
     - Getters and setters for `started` and `finished` dates.
     - `toString`: Returns a string representation of the date tracker details.

3. **Review Class**
   - Attributes: `starRating` (int), `review` (String)
   - Methods:
     - Constructor: Initializes `starRating` and `review`.
     - Getters and setters for `starRating` and `review`.
     - `toString`: Returns a string representation of the review details.

4. **BookCollection Class**
   - Attributes: `currentlyReading` (String), `wantToRead` (String), `alreadyRead` (String)
   - Methods:
     - Constructor: Initializes the names for the three book categories.
     - Getters and setters for `currentlyReading`, `wantToRead`, and `alreadyRead`.
     - `toString`: Returns a string representation of the book collection details.

5. **BookManager Class**
   - Methods:
     - `addBook(title: String, author: String, genre: String, format: String, cover: String): void`
       - Adds details of a new book to the tracker.
       - Parameters:
         - `title` (String): The title of the book.
         - `author` (String): The author of the book.
         - `genre` (String): The genre of the book.
         - `format` (String): The format of the book (e.g., ebook, audio book, physical book).
         - `cover` (String): The cover information of the book (e.g., cover image URL).
       - Returns: `void`
       - Behavior:
         - Creates a new book with the provided details and adds it to the book tracker.
         - Updates book collections or categories as needed.

     - `deleteBook(book: Book): void`
       - Deletes a book from the tracker.
       - Parameters:
         - `book` (Book): The book to be deleted.
       - Returns: `void`
       - Behavior:
         - Removes the specified book from the book tracker.
         - Updates book collections or categories as needed.

     - `trackProgress(book: Book, startedDate: LocalDate, finishedDate: LocalDate): void`
       - Tracks reading progress for a book.
       - Parameters:
         - `book` (Book): The book for which progress is tracked.
         - `startedDate` (LocalDate): The date when the book was started.
         - `finishedDate` (LocalDate): The date when the book was finished.
       - Returns: `void`
       - Behavior:
         - Updates the reading progress information for the specified book.
         - Updates book collections or categories as needed.

## License

This project is licensed under the [MIT License](LICENSE).
