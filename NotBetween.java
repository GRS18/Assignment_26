/*Assignment 6: Logical NOT (!) for Negation
Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
• Use logical ! to negate conditions.
*/
package Assignment_26;

import java.util.Scanner;

class Between {

	Scanner in = new Scanner(System.in);

	private int num;

	public void accept() {
		System.out.println("Enter the Number: ");
		num = in.nextInt();
	}

	public void check() {
		if (!(num > 10 && num < 20))
			System.out.println("Number is NOT between 10 & 20");
		else
			System.out.println("Number is Between 10 & 20");
	}
}

class NotBetween {

	public static void main(String[] args) {
		Between between = new Between();
		between.accept();
		between.check();

	}

}
