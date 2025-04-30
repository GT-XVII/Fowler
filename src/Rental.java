/**
 * Represents a rental of a movie by a customer.
 * Tracks the movie and the number of days it was rented.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * Constructs a rental with the specified movie and rental duration.
     *
     * @param newmovie       the movie being rented
     * @param newdaysRented  the number of days the movie is rented for
     */
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    /**
     * Returns the number of days the movie was rented.
     *
     * @return number of rental days
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Returns the movie associated with this rental.
     *
     * @return the rented movie
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Calculates the charge for this rental.
     *
     * @return the rental charge
     */
    public double getCharge() {
        return getMovie().getCharge(getDaysRented());
    }

    /**
     * Calculates the frequent renter points for this rental.
     *
     * @return the frequent renter points
     */
    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }
}