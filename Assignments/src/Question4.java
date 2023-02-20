import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;

public class Question4 {
	public static void main(String[] args) {
		
		/*
		 * // create instance of Random class Random randomNum = new Random();
		 * System.out.println("Bet the following combination. It'll make you rich!"); ---------*------got stuck as couldn't sort the number at the end.
		 * 
		 * for (int i=1; i<7; i++) { int num = randomNum.nextInt(49);
		 * System.out.println(num); }
		 */
		
		//Create arraylist
		ArrayList num = new ArrayList();
		//given range is 1-49
		for(int i=0; i<49; i++)
		{
		   num.add(i+1);	
		}
		
		//store this array list in collection so as to modify them
		Collections.shuffle(num);
		
		System.out.println("Bet the following combination. It'll make you rich!");
		
		//The num has list of numbers thats in shuffled manner, hence extract first 6 numbers
		for(int j=0; j<6; j++)
		{
			int randNum = (int)num.get(j);
			System.out.println(randNum);
			
		}
	 }
	
}
