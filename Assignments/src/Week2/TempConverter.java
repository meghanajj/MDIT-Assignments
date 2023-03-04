package Week2;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {

				Scanner input = new Scanner(System.in);
				int option = 0;
				double celcius;
				double fahrenheit;
				double kelvin;
				
				System.out.println("1. Celcius to Fahrenheit\r\n"
						+ "2. Celcius to Kelvin\r\n"
						+ "3. Fahrenheit to Celcius\r\n"
						+ "4. Fahrenheit to Kelvin\r\n"
						+ "5. Kelvin to Celcius\r\n"
						+ "6. Kelvin to Fahrenheit\r\n"
						+ "7. Exit\r\n");

				do {

					System.out.print("Enter Choice: ");
					option = input.nextInt();

					switch (option) {

						// Celcius to Fahrenheit
						case 1: {

							System.out.print("Enter Celcius value:");
							celcius = input.nextDouble();
							fahrenheit = (celcius * 1.8) + 32;
							System.out.println("Fahrenheit value: " + fahrenheit);
							break;
						}

						//Celcius to Kelvin
						case 2: {

							System.out.print("Enter Celcius value:");
							celcius = input.nextDouble();
							kelvin = celcius + 273.15;
							System.out.println("Kelvin value: " + kelvin);
							break;
						}

						// Fahrenheit to Celcius
						case 3: {

							System.out.print("Enter Fahrenheit value:");
							fahrenheit = input.nextDouble();
							celcius = (fahrenheit - 32) * (5 / 9);
							System.out.println("Celcius value: " + celcius);
							break;
						}

						// Fahrenheit to Kelvin
						case 4: {

							System.out.print("Enter Fahrenheit value:");
							fahrenheit = input.nextDouble();
							kelvin = (fahrenheit - 32) * (5 / 9) + 273.15;
							System.out.println("Celcius value: " + kelvin);
							break;
						}

						// Kelvin to Celcius
						case 5: {

							System.out.print("Enter Kelvin value:");
							kelvin = input.nextDouble();
							celcius = kelvin - 273.15;
							System.out.println("Celcius value: " + celcius);
							break;

						}

						// Kelvin to Fahrenheit
						case 6: {

							System.out.print("Enter Kelvin value:");
							kelvin = input.nextDouble();
							fahrenheit = (kelvin - 273.15) * (9 / 5) + 32;
							System.out.println("Celcius value: " + fahrenheit);
							break;

						}

						// Exit
						case 7: {

							System.out.print("Program Terminated");
							break;

						}

					}
				}while (option < 7);
	}
}
				
