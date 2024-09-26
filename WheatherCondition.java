/*Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
• Temperature should be between 20°C and 30°C.
• It should not be raining.
Requirements:
• Use logical operators && and !.*/
package Assignment_26;

import java.util.Scanner;

class Wheather{
	Scanner in=new Scanner(System.in);
	
	int temprature;
	boolean rain;
	
	public void accept()
	{
		System.out.println("Enter Temprature");
		temprature=in.nextInt();
		System.out.println("Enter Rain is Fall or not? (True/False)");
		rain=in.nextBoolean();
	}
	public void check()
	{
		if(!(temprature>20 && temprature<30 && rain==false))
			System.out.println("The conditions to go outside is NOT safe");
		else
			System.out.println("The conditions to go outside is safe");
	}
	
}
class WheatherCondition {

	public static void main(String[] args) {
		Wheather wheather = new Wheather();
		wheather.accept();
		wheather.check();

	}

}
