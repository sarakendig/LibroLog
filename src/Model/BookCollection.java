package Model;

public class BookCollection {
    private String currentlyReading;
    private String wantToRead;
    private String alreadyRead;

    public BookCollection(String currentlyReading, String wantToRead, String alreadyRead) {
        this.currentlyReading = currentlyReading;
        this.wantToRead = wantToRead;
        this.alreadyRead = alreadyRead;
    }

    public String getCurrentlyReading() {
        return currentlyReading;
    }

    public void setCurrentlyReading(String currentlyReading) {
        this.currentlyReading = currentlyReading;
    }

    public String getWantToRead() {
        return wantToRead;
    }

    public void setWantToRead(String wantToRead) {
        this.wantToRead = wantToRead;
    }

    public String getAlreadyRead() {
        return alreadyRead;
    }

    public void setAlreadyRead(String alreadyRead) {
        this.alreadyRead = alreadyRead;
    }

    @Override
    public String toString() {
        return "BookCollection{" +
                "currentlyReading='" + currentlyReading + '\'' +
                ", wantToRead='" + wantToRead + '\'' +
                ", alreadyRead='" + alreadyRead + '\'' +
                '}';
    }
}
