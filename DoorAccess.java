/*Assignment 3: Door Access Control
Write a program that simulates an access control system. 
A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
• Use logical operators &&, ||, and !.*/
package Assignment_26;

import java.util.Scanner;

public class DoorAccess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int userId, accesCard, admin;

		System.out.println("Enter the Valid User ID for Access");
		userId = in.nextInt();
		System.out.println("Enter the valid  access For access");
		accesCard = in.nextInt();
		System.out.println("Enter the admin key");
		admin = in.nextInt();

		if (userId == 1111 && accesCard == 2222 || admin == 0000)
			System.out.println("You are granted sucessfully! ");
		else
			System.out.println("You are not granted ! Sorry");
	}
}
