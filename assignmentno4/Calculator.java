//que9


package assignmentno4;

public class Calculator {
	 private int num1;
	    private int num2;

	    public Calculator(int num1, int num2) {
	        this.num1 = num1;
	        this.num2 = num2;
	    }

	    public int add() {
	        if (num1 < 0 || num2 < 0) {
	            throw new ArithmeticException("Numbers should be positive for addition.");
	        }
	        return num1 + num2;
	    }

	    public int subtract() {
	        if (num1 < 0 || num2 < 0) {
	            throw new ArithmeticException("Numbers should be positive for subtraction.");
	        }
	        return num1 - num2;
	    }

	    public int multiply() {
	        if (num1 == 0 || num2 == 0) {
	            throw new ArithmeticException("Numbers should not be zero for multiplication.");
	        }
	        return num1 * num2;
	    }

	    public int divide() {
	        if (num2 == 0) {
	            throw new ArithmeticException("Second number should not be zero for division.");
	        }
	        return num1 / num2;
	    }

	    public static void main(String[] args) {
	        try {
	            
	            Calculator obj1 = new Calculator(10, 5);
	            Calculator obj2 = new Calculator(20, -5);
	            Calculator obj3 = new Calculator(4, 0);   
	            Calculator obj4 = new Calculator(10, 0); 
	            
	            System.out.println("Addition: " + obj1.add());
	            System.out.println("Subtraction: " + obj2.subtract());
	            System.out.println("Multiplication: " + obj3.multiply());
	            System.out.println("Division: " + obj4.divide());
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Please enter valid integers.");
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


