//que 2

package assignmentno4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Original string: " + str);
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (sb.indexOf(String.valueOf(currentChar)) == -1) {
                sb.append(currentChar);
            }
        }
        
        String result = sb.toString();
        System.out.println("String after removing duplicates: " + result);
    }
}



