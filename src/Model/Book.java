package Model;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String format;
    private String cover;
    private Date readingDates;

    public Book(String title, String author, String genre, String format, String cover) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.format = format;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Date getReadingDates() {
        return readingDates;
    }

    public void setReadingDates(Date readingDates) {
        this.readingDates = readingDates;
    }

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
