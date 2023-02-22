import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		
		
		//Create arraylist
		ArrayList num = new ArrayList();
		
		//give range
		System.out.print("Enter the min number of the range.");
		Scanner input1 = new Scanner(System.in);
		int min = input1.nextInt();
		
		System.out.print("Enter the max number of the range.");

		int max = input1.nextInt();
		
		for(int i=min; i<max; i++)
		{
		   num.add(i+1);	
		}
		
		//store this array list in collection so as to modify them
		Collections.shuffle(num);
		
		//The num has list of numbers thats in shuffled manner, hence extract first 6 numbers
		System.out.print("Enter the number of bets to be selected.");
		
		int n = input1.nextInt();
		
		System.out.println("Bet the following combination. It'll make you rich!");
		
		for(int j=0; j<n; j++)
		{
			int randNum = (int)num.get(j);
			System.out.println(randNum);
			
		}
	 }
	
}
