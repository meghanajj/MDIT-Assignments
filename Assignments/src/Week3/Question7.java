package Week3;

import java.util.Map;
import java.util.TreeMap;

public class Question7 {
	
	public static void main(String[] args) {
		
		//create a map of key value as string and integer type
		Map<String,Integer> subjects = new TreeMap<>();
		//add the key and value using put()
		subjects.put("English",101);
		subjects.put("Mathematics", 102);
		subjects.put("Kannada", 103);
		for(String item:subjects.keySet())
			System.out.println(item +"=>"+subjects.get(item));
		}

}
