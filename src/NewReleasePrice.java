/**
 * Represents the pricing strategy for new release movies.
 * Applies a flat rate per day and provides extra renter points.
 */
public class NewReleasePrice implements Price {

    /**
     * Returns the price code for new release movies.
     *
     * @return the price code for new releases
     */
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    /**
     * Calculates the charge for renting a new release movie.
     *
     * @param daysRented the number of days rented
     * @return the charge based on days rented
     */
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    /**
     * Returns the frequent renter points for a new release movie.
     * Always returns 2 points regardless of rental duration.
     *
     * @param daysRented the number of days the movie is rented
     * @return frequent renter points earned
     */
    public int getFrequentRenterPoints(int daysRented) {
        return 2;
    }
}
