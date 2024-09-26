/*Assignment 5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications. 
A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
• Use logical operators to combine conditions.
*/
package Assignment_26;

import java.util.Scanner;

public class JobApplication {
	Scanner in = new Scanner(System.in);
	private boolean education;
	private boolean criminal;

	public void accept() {
		System.out.println("You have Bachelor's Degree or any Equivalent Experience ?(True/False)");
		education = in.nextBoolean();
		System.out.println("You have any Criminal Records ? (True/False) ");
		criminal = in.nextBoolean();
	}

	public void check() {
		if (education == true && criminal == false)
			System.out.println("you are Eligible for Job");
		else
			System.out.println("You are not Eligible for Job");
	}

	public static void main(String[] args) {
		JobApplication jobapplication = new JobApplication();

		jobapplication.accept();
		jobapplication.check();

	}

}
