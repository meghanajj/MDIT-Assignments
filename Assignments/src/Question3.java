import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		System.out.print("What is your name? ");
		Scanner input1 = new Scanner(System.in);
		String name = input1.nextLine();
		
		System.out.print("How old are you? ");
		int age = input1.nextInt();
		
		age ++;
		System.out.print("Hello " + name +". Next year, you'll be " + age );
	    input1.close();
}
}
