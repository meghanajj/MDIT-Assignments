package Week3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question1 {
	
	public static void main(String[] args) throws IOException {
		/*
		 * //use a filewriter class to create a new file FileWriter myWriter = new
		 * FileWriter("file.txt"); //write the content in the file
		 * myWriter.write("This is my first file"); myWriter.close();
		 * System.out.println("The new file is created");
		 */
		      
		      //Get the file
				  File file = new File("file.txt");
				  if (file.createNewFile()) 
					  System.out.println("The new file is created");
				  else
					  System.out.println("The file already exists");
	  }
}
				 



