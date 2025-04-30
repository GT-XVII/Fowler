/**
 * Represents the pricing strategy for regular movies.
 * Applies a base charge with additional cost after a threshold.
 */
public class RegularPrice implements Price {

    /**
     * Returns the price code for regular movies.
     *
     * @return the price code for regular category
     */
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    /**
     * Calculates the charge for renting a regular movie.
     *
     * @param daysRented the number of days the movie is rented
     * @return the charge based on rental duration
     */
    public double getCharge(int daysRented) {
        if (daysRented > 2) {
            return (daysRented - 2) * 1.5 + 2;
        } else {
            return 2;
        }
    }

    /**
     * Returns the frequent renter points for a regular movie.
     *
     * @param daysRented the number of days the movie is rented
     * @return the number of frequent renter points
     */
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}


