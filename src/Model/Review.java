package Model;

/**
 * Represents a review with a star rating and textual content.
 */
public class Review {

    private int starRating;
    private String review;

    /**
     * Constructs a new Review object with the specified star rating and review content.
     *
     * @param starRating The star rating given in the review.
     * @param review The textual content of the review.
     */
    public Review(int starRating, String review) {
        this.starRating = starRating;
        this.review = review;
    }

    /**
     * Gets the star rating of the review.
     *
     * @return The star rating of the review.
     */
    public int getStarRating() {
        return starRating;
    }

    /**
     * Sets the star rating of the review.
     *
     * @param starRating The new star rating to be set.
     */
    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    /**
     * Gets the textual content of the review.
     *
     * @return The textual content of the review.
     */
    public String getReview() {
        return review;
    }

    /**
     * Sets the textual content of the review.
     *
     * @param review The new textual content to be set.
     */
    public void setReview(String review) {
        this.review = review;
    }

    /**
     * Returns a string representation of the Review object.
     *
     * @return A string representation of the Review object.
     */
    @Override
    public String toString() {
        return "Review{" +
                "starRating=" + starRating +
                ", review='" + review + '\'' +
                '}';
    }
}
