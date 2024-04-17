//que 8

package assignmentno4;

public class VowelValidator {
	public static void main(String[] args) {
		String input1 = "hello";
		String input2 = "xyz";

		try {
			validateVowels(input1);
			System.out.println(input1 + " contains vowels.");
		} catch (NoVowelsException e) {
			System.out.println(e.getMessage());
		}

		try {
			validateVowels(input2);
			System.out.println(input2 + " contains vowels.");
		} catch (NoVowelsException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validateVowels(String str) throws NoVowelsException {
		if (!str.matches(".*[aeiouAEIOU].*")) {
			throw new NoVowelsException("No vowels found in the string.");
		}
	}
}

class NoVowelsException extends Exception {
	public NoVowelsException(String message) {
		super(message);
	}
}
