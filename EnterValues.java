import java.util.Scanner;

public class EnterValues{
	public static void main(String args []){

		Scanner keyboardIn = new Scanner(System.in);
		String name = "";
		int numOne = 0, numTwo = 0, result = 0;

		System.out.println("What is your name?");
		name = keyboardIn.nextLine();
		// .nextLine for string .nextInt for integers

		System.out.println("Provide first value to sum:");
		numOne = keyboardIn.nextInt();

		System.out.println("Provide second value to sum:");
		numTwo = keyboardIn.nextInt();

		result = numOne + numTwo;

		System.out.println("Hello " + name + ", your sum result is: " + result);
	}
}