package Week2;

public class StudentMain {

	public static void main(String[] args) {
		//instance of class
		Student stud = new Student(null, 0);
		//invoke the setter and set name and rollnumber
		stud.setName("Kiran");
		stud.setRollNumber(11);
		//invoke getter and print the name and rollnumber
		stud.getName();
		stud.getRollNumber();
	}
}
