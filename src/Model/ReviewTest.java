package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for the {@link Review} class.
 */
class ReviewTest {

    /**
     * Test the constructor and getters of the {@link Review} class.
     */
    @Test
    void testReviewConstructorAndGetters() {
        // Test the constructor and getters
        int starRating = 5;
        String reviewContent = "This book is amazing!";
        Review review = new Review(starRating, reviewContent);

        assertEquals(starRating, review.getStarRating());
        assertEquals(reviewContent, review.getReview());
    }

    /**
     * Test the setters of the {@link Review} class.
     */
    @Test
    void testReviewSetters() {
        // Test the setters
        int starRating = 4;
        String reviewContent = "Enjoyed reading it!";
        Review review = new Review(0, null);

        review.setStarRating(starRating);
        review.setReview(reviewContent);

        assertEquals(starRating, review.getStarRating());
        assertEquals(reviewContent, review.getReview());
    }

    /**
     * Test the {@code toString} method of the {@link Review} class.
     */
    @Test
    void testToString() {
        // Test the toString method
        int starRating = 3;
        String reviewContent = "It's an okay book.";
        Review review = new Review(starRating, reviewContent);

        assertEquals("Review{starRating=3, review='It's an okay book.'}", review.toString());
    }
}
