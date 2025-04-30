import java.util.Enumeration;
import java.util.Vector;

/**
 * Represents a customer who rents movies.
 * Tracks rental records and calculates statements and frequent renter points.
 */
class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    /**
     * Constructs a new Customer with a given name.
     *
     * @param newname the name of the customer
     */
    public Customer(String newname) {
        name = newname;
    }

    /**
     * Adds a rental to the customer's record.
     *
     * @param arg the rental to add
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * Returns the name of the customer.
     *
     * @return the customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * Generates a detailed rental statement for the customer.
     *
     * @return the formatted rental statement
     */
    public String statement() {
        Enumeration<Rental> enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\tTitle\t\tDays\tAmount\n";

        while (enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t\t" + each.getDaysRented() + "\t" + each.getCharge() + "\n";
        }

        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    /**
     * Calculates the total charge for all rentals.
     *
     * @return the total charge amount
     */
    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    /**
     * Calculates the total frequent renter points earned.
     *
     * @return the total frequent renter points
     */
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}