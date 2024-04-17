//que3

package assignmentno4;

public class ConcatenateArrayElements {
	public static void main(String[] args) {
        String[] array = {"Hello", "World", "Java", "Programming"};
        
        // Using StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
        }
        
        String result = sb.toString();
        System.out.println("Concatenated string: " + result);
    }
}


