package Week3;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
	
	public static void main(String[] args) {
		//create a map of key value as string and integer type
		Map<String,Integer> subjects = new HashMap<>();
		//add the key and value using put()
		subjects.put("English",101);
		subjects.put("Mathematics", 102);
		subjects.put("Kannada", 103);
		//print each key value pair using for each loop
		for(String item:subjects.keySet())
		System.out.println(item +"=>"+subjects.get(item));
	}

}
