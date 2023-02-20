import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		System.out.print("How much money do you need to retire? ");
		Scanner input1 = new Scanner(System.in);
		float Money = input1.nextFloat();
		
		System.out.print("How much money will you contribute every year? ");
		Scanner input2 = new Scanner(System.in);
		float Contribution = input2.nextFloat();
		
		System.out.print("Interest rate in %: ");
		Scanner input3 = new Scanner(System.in);
		float IRate = input3.nextFloat();
		
		float count=0;
		float sum=Contribution;
		do {
			count ++;
			sum = Contribution + sum + (sum * (IRate / 100));
		}while(sum<=Money);
		
		System.out.println("You can retire in " + (int)count+ " years.");
	}

}
