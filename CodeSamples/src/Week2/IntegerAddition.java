package Week2;
import java.util.Scanner; // import class Scanner
public class IntegerAddition {
	public static void main(String[] args) {
		// Use Scanner to get input from console
		Scanner input = new Scanner(System.in);
		// Declare variables
		int number1, number2, sum;
		System.out.print("Enter first integer: ");
		number1 = input.nextInt(); // reads first number
		System.out.print("Enter second integer: ");
		number2 = input.nextInt(); // reads second number
		// add two numbers together
		sum = number1 + number2;
		// output sum to screen
		System.out.printf("Sum is %d\n", sum);
	} // end method
} // end class
