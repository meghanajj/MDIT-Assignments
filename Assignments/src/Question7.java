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
	
		int count=0;
		String ans;
		do
		{
			b = b + (Contribution * (IRate / 100));
			count++;
		    System.out.println("After year " + count + ", your balance is " + String.format("%.2f", b));
		
		    System.out.println("Ready to retire? (Y/N)");
		    Scanner input4 = new Scanner(System.in);
		    ans = input4.nextLine();
		    
	    }while(ans.equals("n"));
		
		if(ans.equals("y"))
		{
			 System.out.println("you are retired! Thank you.");
		}
		else
		{
			 System.out.println("Program Terminated!");
		}
	}
}
