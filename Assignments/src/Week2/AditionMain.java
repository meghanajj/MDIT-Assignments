package Week2;

import java.util.Scanner;

public class AditionMain extends Addition {
	
public static void main(String[] args) {
		//use scanner class to get the inputs from user
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the 1st Parameter.");
		param1 = input.nextFloat();
		System.out.println("Enter the 2nd Parameter.");
		param2 = input.nextFloat();
		System.out.println("Enter the 3rd Parameter.");
		param3 = input.nextFloat();
		
		//create instance of class
		Addition add = new Addition();
		//invoke the method signatures 
		add.ParamSum(param1, param2);
		add.ParamSum(param1, param2, param3);
	}
}
