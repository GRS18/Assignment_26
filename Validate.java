/*Assignment 1: Validating Age and Income
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
* A person is eligible if their age is between 18 and 60 and their income is above $25,000.
   Use logical && to combine these conditions.*/
package Assignment_26;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Age : ");
		int age = in.nextInt();
		System.out.println("Enter Income: ");
		double income = in.nextDouble();

		if (age >= 18 && age <= 60 && income > 25000)
			System.out.println("User is Eligible for Loan");
		else
			System.out.println("User is Not Eligible for Loan");
	}

}
