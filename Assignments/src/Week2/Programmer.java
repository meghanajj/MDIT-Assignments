package Week2;

import java.util.Scanner;

public class Programmer extends Employee{
	//declare variable
	static double bonus;
	
	public static void main(String[] args) {
		//get input from user for the salary and bonus amount
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the salary.");
		salary = input.nextDouble();
		System.out.println("Enter the bonus amount.");
		double bonus = input.nextDouble();
		//summ of salary and bonus
		double total = salary + bonus;
		
		System.out.println("The total of slary and bonus is "+total);
	}

}
