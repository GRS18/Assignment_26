/*Assignment 8: Determine the Greatest Number Using Ternary Operator
Write a Java program to find the greatest number among two numbers using the ternary operator.
*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers.*/
package Assignment_26;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n1;
		int n2;
		int max;

		System.out.println("Enter N1: ");
		n1 = in.nextInt();

		System.out.println("Enter N2: ");
		n2 = in.nextInt();
		max = (n1 > n2) ? n1 : n2;
		System.out.println("Largest number is: " + max);
	}
}
