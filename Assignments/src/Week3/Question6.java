package Week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Question6 {
	public static void main(String[] args) {
		
		//create a map of key value as string and integer type
				Map<String,Integer> subjects = new HashMap<>();
				//add the key and value using put()
				subjects.put("English",101);
				subjects.put("Mathematics", 102);
				subjects.put("Kannada", 103);
				
				//use iterator to iterate over map elements
				 Iterator<Map.Entry<String, Integer>> itr = subjects.entrySet().iterator();
			
				//use while loop to print each element of map
				do {
					//print each item of the map 
					 Map.Entry<String, Integer> item = itr.next();
		             System.out.println(item.getKey() +"=>"+ item.getValue());
				}while(itr.hasNext());
	}

}
