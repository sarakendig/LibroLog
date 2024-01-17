package Model;

import java.time.LocalDate;

/**
 * Represents a date range, including a start date and a finish date.
 */
public class Date {

    private LocalDate started;
    private LocalDate finished;

    /**
     * Constructs a new Date object with the specified start and finish dates.
     *
     * @param started The start date of the date range.
     * @param finished The finish date of the date range.
     */
    public Date(LocalDate started, LocalDate finished) {
        this.started = started;
        this.finished = finished;
    }

    /**
     * Gets the start date of the date range.
     *
     * @return The start date of the date range.
     */
    public LocalDate getStarted() {
        return started;
    }

    /**
     * Sets the start date of the date range.
     *
     * @param started The new start date of the date range.
     */
    public void setStarted(LocalDate started) {
        this.started = started;
    }

    /**
     * Gets the finish date of the date range.
     *
     * @return The finish date of the date range.
     */
    public LocalDate getFinished() {
        return finished;
    }

    /**
     * Sets the finish date of the date range.
     *
     * @param finished The new finish date of the date range.
     */
    public void setFinished(LocalDate finished) {
        this.finished = finished;
    }

    /**
     * Returns a string representation of the Date object.
     *
     * @return A string representation of the Date object.
     */
    @Override
    public String toString() {
        return "Date{" +
                "started=" + started +
                ", finished=" + finished +
                '}';
    }
}
