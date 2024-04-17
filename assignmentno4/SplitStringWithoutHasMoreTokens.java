//que7

package assignmentno4;

import java.util.StringTokenizer;

public class SplitStringWithoutHasMoreTokens {
	public static void main(String[] args) {
		String input = "Hello World";

		try {

			StringTokenizer tokenizer = new StringTokenizer(input);

			String token1 = tokenizer.nextToken();
			String token2 = tokenizer.nextToken();
			String token3 = tokenizer.nextToken();

			System.out.println("First token: " + token1);
			System.out.println("Second token: " + token2);
			System.out.println("Third token: " + token3);

			if (tokenizer.hasMoreTokens()) {
				System.out.println("There are more tokens");
			} else {
				System.out.println("No more tokens");
			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
