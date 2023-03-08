package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		//create a Arraylist of string type 
		List<String> ecommerce = new ArrayList<>();
		//add string for the list
		ecommerce.add("Flipkart");
		ecommerce.add("Myntra");
		ecommerce.add("Amazon");
		ecommerce.add("Nykaa");
		ecommerce.add("Meesho");
		ecommerce.add("Ajio");
		
		//print the array without reversing the list
		System.out.println("Before reversing the list");
		System.out.println("Ecommerce companies = "+ecommerce);
		//print the array reversing the list
	    Collections.reverse(ecommerce);
		System.out.println("After reversing the list");
		System.out.println("Ecommerce companies = "+ecommerce);
		
	}
	
	
}
