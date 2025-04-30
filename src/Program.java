import java.util.*;
/**
 * Entry point for the Movie Store application.
 * Demonstrates the usage of the Movie, Rental, and Customer classes.
 */
public class Program {

    /**
     * This is the main entry point for the application.
     * It creates sample movies, rentals, and a customer, then prints a rental statement.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
    }
}


