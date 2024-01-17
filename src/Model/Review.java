package Model;

public class Review {

    private int starRating;
    private String review;

    public Review(int starRating, String review) {
        this.starRating = starRating;
        this.review = review;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Review{" +
                "starRating=" + starRating +
                ", review='" + review + '\'' +
                '}';
    }
}
