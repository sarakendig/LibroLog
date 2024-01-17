package Model;

import java.time.LocalDate;

public class Date {

    private LocalDate started;
    private LocalDate finished;

    public Date(LocalDate started, LocalDate finished) {
        this.started = started;
        this.finished = finished;
    }

    public LocalDate getStarted() {
        return started;
    }

    public void setStarted(LocalDate started) {
        this.started = started;
    }

    public LocalDate getFinished() {
        return finished;
    }

    public void setFinished(LocalDate finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Date{" +
                "started=" + started +
                ", finished=" + finished +
                '}';
    }
}
