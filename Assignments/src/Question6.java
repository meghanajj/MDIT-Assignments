import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		//accept input from user for retirement money
		System.out.print("How much money do you need to retire? ");
		Scanner input1 = new Scanner(System.in);
		float money = input1.nextFloat();
		//accept input from user for money contributed every year
		System.out.print("How much money will you contribute every year? ");
		float contribution = input1.nextFloat();
		//accept input from user for interest rate in percentage
		System.out.print("Interest rate in %: ");
		float iRate = input1.nextFloat();
		
		//declare variables
		float count=0;
		float sum=contribution;
		do {
			count ++;
			sum = contribution + sum + (sum * (iRate / 100));
		}while(sum<=money);
		
		System.out.println("You can retire in " + (int)count+ " years.");
	    input1.close();
	}
	

}
