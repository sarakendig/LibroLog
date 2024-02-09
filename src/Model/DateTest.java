package Model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for the {@link Date} class.
 */
class DateTest {

    /**
     * Test the constructor and getters of the {@link Date} class.
     */
    @Test
    void testDateConstructorAndGetters() {
        // Test the constructor and getters
        LocalDate started = LocalDate.of(2022, 1, 1);
        LocalDate finished = LocalDate.of(2022, 2, 1);
        Date date = new Date(started, finished);

        assertEquals(started, date.getStarted());
        assertEquals(finished, date.getFinished());
    }

    /**
     * Test the setters of the {@link Date} class.
     */
    @Test
    void testDateSetters() {
        // Test the setters
        LocalDate started = LocalDate.of(2022, 1, 1);
        LocalDate finished = LocalDate.of(2022, 2, 1);
        Date date = new Date(null, null);

        date.setStarted(started);
        date.setFinished(finished);

        assertEquals(started, date.getStarted());
        assertEquals(finished, date.getFinished());
    }

    /**
     * Test the {@code toString} method of the {@link Date} class.
     */
    @Test
    void testToString() {
        // Test the toString method
        LocalDate started = LocalDate.of(2022, 1, 1);
        LocalDate finished = LocalDate.of(2022, 2, 1);
        Date date = new Date(started, finished);

        assertEquals("Date{started=2022-01-01, finished=2022-02-01}", date.toString());
    }
}