package Assignment_26;

import java.util.Scanner;

public class ExamGrade {
	Scanner in = new Scanner(System.in);

	private int sub1;
	private int sub2;
	private int sub3;
	private int avg;

	public void acccept() {
		System.out.println("Enter Sub 1 Marks: ");
		sub1 = in.nextInt();
		System.out.println("Enter Sub 2 Marks: ");
		sub2 = in.nextInt();
		System.out.println("Enter Sub 3 Marks: ");
		sub3 = in.nextInt();
		avg = (sub1 + sub2 + sub3) / 3;
	}

	public void checkPass() {
		if (avg >= 60 && sub1 > 40 && sub2 >= 40 && sub3 >= 40)
			System.out.println("Student Pass in Exam");
		else
			System.out.println("Student is Fail");
	}

	public void diplay() {
		System.out.println("Sub 1 Marks " + sub1);
		System.out.println("Sub 2 Marks " + sub2);
		System.out.println("Sub 3 Marks " + sub3);
		System.out.println("Total Average is " + avg);
	}

	public static void main(String[] args) {

		ExamGrade examgrade = new ExamGrade();

		examgrade.acccept();
		examgrade.diplay();
		examgrade.checkPass();
	}
}
