package Week2;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
	// Declare variables
		String firstName, lastName;
		int age;
		try (//Declare and Create Scanner object
		Scanner input = new Scanner(System.in)) {
			// Get input from user
			System.out.print("Enter your first name: ");
			firstName = input.next();
			System.out.print("Enter your last name: ");
			lastName = input.next();
			System.out.print("Enter you age: ");
			age = input.nextInt();
		}
		// Output sentence to screen
		System.out.println("Hello " + firstName + " " + lastName + " you age is " + age + "!");
	} // end main method
} // end class
