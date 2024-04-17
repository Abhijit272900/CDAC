//que 6

package assignmentno4;

import java.util.Scanner;
public class ArrayValueAtNthPosition {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            // Read elements of the array from the user
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element at index " + i + ": ");
                array[i] = scanner.nextInt();
            }

            // Read the value at the nth position
            System.out.print("Enter the position (0-based) to retrieve value from the array: ");
            int position = scanner.nextInt();
            int value = array[position];
            System.out.println("Value at position " + position + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position! The array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

