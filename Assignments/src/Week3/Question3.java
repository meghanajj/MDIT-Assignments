package Week3;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

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
		
		//print the array without removing any string
		System.out.println("The size of list before removing a string from the list is "+ ecommerce.size());
		System.out.println("Ecommerce companies = "+ecommerce);
		//remove a string from arraylist
		ecommerce.remove(4);
		System.out.println("The size of list after removing a string from the list is "+ ecommerce.size());
		System.out.println("Ecommerce companies = "+ecommerce);
		
	}
	
	
}
