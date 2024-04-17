//que 4

package assignmentno4;

public class PalindromeChecker {
	 public static void main(String[] args) {
	        String str = "radar";
	        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));
	        
	        String str2 = "hello";
	        System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindrome(str2));
	    }
	    
	    public static boolean isPalindrome(String str) {
	        
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        
	       
	        StringBuilder reversed = new StringBuilder(str).reverse();
	        
	        
	        return str.equals(reversed.toString());
	    }
	}

