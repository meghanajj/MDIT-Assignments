import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		System.out.print("How much money will you contribute every year? ");
		Scanner input1 = new Scanner(System.in);
		float Contribution = input1.nextFloat();
		
		System.out.print("Interest rate in %: ");
		Scanner input2 = new Scanner(System.in);
		float IRate = input2.nextFloat();
		
		float b = Contribution;
		boolean entered = true;
		//enter the year at which balance should be known
		System.out.print("Enter the year at which balance should be known? ");
		Scanner input3 = new Scanner(System.in);
		int Y = input3.nextInt();
		
		for(int i=0; i<Y; i++)
		{
			b = b + (Contribution * (IRate / 100));
		}
		
		System.out.println("After year " + Y + ", your balance is " + String.format("%.2f", b));
		
		    System.out.println("Ready to retire? (Y/N)");
		    Scanner input4 = new Scanner(System.in);
		    String ans = input4.nextLine();
		    
	}
}
