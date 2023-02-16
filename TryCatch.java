import java.util.Scanner;
/**
* The program displays different math equations.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-02-15
*/

public final class TryCatch {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Hi, my name is Titwech. Let calculate Volume");
        System.out.print("Enter the radius of a sphere: ");

        // Using Scanner for getting input from user
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double radDouble = Double.parseDouble(radString);

            // if radius is negative tell user
            if (radDouble <= 0) {
                System.out.println("The radius cannot be negative or 0");
            } else {
                // Calculate the volume
                final double volume = Math.PI * Math.pow(radDouble, 3);
                final double fiVolume = volume * (4f / 3f);

                // Display the area and round to 2 decimal places
                System.out.print("The volume of a sphere with radius, ");
                System.out.print(radString + " cm^3 is ");
                System.out.format("%.2f", fiVolume);
                System.out.println(" cm^3");

            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius."
                + error.getMessage());
        }

        // Close scanner
        scanner.close();

    }
}
