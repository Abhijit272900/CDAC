//que10

package assignmentno4;

import java.util.Scanner;

public class StringToIntegerConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter an integer: ");
			String input = scanner.nextLine();
			int number = convertToInteger(input);
			System.out.println("Converted integer: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Please enter a valid integer.");
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	public static int convertToInteger(String str) throws NumberFormatException, ArithmeticException {

		int number = Integer.parseInt(str);

		if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
			throw new ArithmeticException("Integer overflow! Input value is too large.");
		}

		return number;
	}
}
