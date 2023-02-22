import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		//money contributed every year
		System.out.print("How much money will you contribution every year? ");
		Scanner input1 = new Scanner(System.in);
		float contribution = input1.nextFloat();
		//interest rate at which money is calculated
		System.out.print("Interest rate in %: ");
		float iRate = input1.nextFloat();
		//declare variables
		float sum = contribution;
		int count=0;
		String ans;
		Scanner input2 = new Scanner(System.in);
		//loop to handle Y/N
			do
			{
				sum = sum + (contribution * (iRate / 100));
				count++;
			    System.out.println("After year " + count + ", your balance is " + String.format("%.2f", sum));
			
			    System.out.println("Ready to retire? (Y/N)");
			    
			    ans = input2.nextLine();
			    
		    }while(ans.equals("n"));
		
	    input1.close();
	    input2.close();
	}
	
}
