/**
 * Represents the pricing strategy for children's movies.
 * Applies a specific charge policy based on the number of rental days.
 */
public class ChildrensPrice implements Price {

    /**
     * Returns the price code for children's movies.
     *
     * @return the price code for children's category
     */
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    /**
     * Calculates the charge for renting a children's movie.
     *
     * @param daysRented the number of days the movie is rented
     * @return the charge based on rental duration
     */
    public double getCharge(int daysRented) {
        if (daysRented > 3) {
            return (daysRented - 3) * 1.5;
        } else {
            return 1.5;
        }
    }

    /**
     * Returns the frequent renter points for a children's movie.
     *
     * @param daysRented the number of days the movie is rented
     * @return the number of frequent renter points
     */
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
