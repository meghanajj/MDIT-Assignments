package Week2;

public class Student {
	//instance variables
	private String name;
    private	int rollNumber;
	//constructor
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	//getters and setters
	public String getName() {
		System.out.println("Name is "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		System.out.println("RollNumber is "+rollNumber);
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
}
