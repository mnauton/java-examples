package Week2;
import java.util.Scanner; // import class Scanner
public class DoubleAddition {
	public static void main(String[] args) {
		// Use Scanner to get input from console
		// Enter missing line
		Scanner input = new Scanner(System.in);
		//Declare variables
		double number1, number2, sum;
		// Enter missing line
		System.out.print("Enter first double: ");
		number1 = input.nextDouble(); // reads first number
		// Enter missing line
		System.out.print("Enter second double: ");
		number2 = input.nextDouble(); // reads second number
		// add two numbers together
		// Enter missing line
		sum = number1 + number2;
		// output sum to screen
		System.out.println("Sum is " + sum);
	} // end method
} // end class
