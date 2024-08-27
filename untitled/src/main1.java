import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Set the locale to US

        float a = 0;
        float b = 0;
        boolean validInput = false;

        // Loop until valid input is received for 'a'
        while (!validInput) {
            try {
                System.out.print("Enter the first float number: ");
                a = sc.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float number.");
                sc.next(); // Clear the invalid input
            }
        }

        validInput = false; // Reset for next input

        // Loop until valid input is received for 'b'
        while (!validInput) {
            try {
                System.out.print("Enter the second float number: ");
                b = sc.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float number.");
                sc.next(); // Clear the invalid input
            }
        }

        System.out.println("The sum is: " + (a + b));
    }
}