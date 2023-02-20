import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		System.out.print("What is your name? ");
		Scanner input1 = new Scanner(System.in);
		String name = input1.nextLine();
		
		System.out.print("How old are you? ");
		Scanner input2 = new Scanner(System.in);
		int age = input2.nextInt();
		
		age ++;
		System.out.print("Hello " + name +". Next year, you'll be " + age );
	
}
}
