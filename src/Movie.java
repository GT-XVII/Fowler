/**
 * Represents a movie with a title and pricing strategy.
 * Supports calculating charges and frequent renter points.
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private Price price;

    /**
     * Constructs a new Movie with the given title and price code.
     *
     * @param newtitle  the title of the movie
     * @param priceCode the price category of the movie
     */
    public Movie(String newtitle, int priceCode) {
        title = newtitle;
        setPriceCode(priceCode);
    }

    /**
     * Gets the price code of the movie.
     *
     * @return the price code
     */
    public int getPriceCode() {
        return price.getPriceCode();
    }

    /**
     * Sets the price code and corresponding pricing strategy.
     *
     * @param arg the new price code
     */
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    /**
     * Gets the movie title.
     *
     * @return the title of the movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Calculates the charge for renting the movie.
     *
     * @param daysRented the number of days rented
     * @return the charge
     */
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    /**
     * Calculates the frequent renter points earned.
     *
     * @param daysRented the number of days rented
     * @return the frequent renter points
     */
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}