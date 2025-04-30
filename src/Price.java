/**
 * Represents a pricing strategy for a movie category.
 * Implementing classes define specific behavior for charges and frequent renter points.
 */
public interface Price {

    /**
     * Gets the price code representing the movie category.
     *
     * @return the price code
     */
    int getPriceCode();

    /**
     * Calculates the rental charge based on number of days rented.
     *
     * @param daysRented the number of days the item is rented
     * @return the calculated charge
     */
    double getCharge(int daysRented);

    /**
     * Calculates the frequent renter points earned based on rental duration.
     *
     * @param daysRented the number of days the item is rented
     * @return the earned frequent renter points
     */
    int getFrequentRenterPoints(int daysRented);
}
