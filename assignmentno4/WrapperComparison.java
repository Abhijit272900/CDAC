//Que1


package assignmentno4;

public class WrapperComparison {
	public static void main(String[] args) {

		Integer num1 = new Integer(5);
		Integer num2 = new Integer(5);

		System.out.println("Comparing with ==:");
		System.out.println(num1 == num2);

		System.out.println("Comparing with equals():");
		System.out.println(num1.equals(num2));

		Float f1 = new Float(3.14);
		Float f2 = new Float(3.14);

		System.out.println("Comparing with ==:");
		System.out.println(f1 == f2);

		System.out.println("Comparing with equals():");
		System.out.println(f1.equals(f2));
	}
}
