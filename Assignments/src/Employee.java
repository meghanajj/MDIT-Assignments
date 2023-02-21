
//Employee class with empId and name as attributes
public class Employee{
	
	 private double salary;
	 private  String name,hireDay;
	  
	 

	//Employee class constructor
	  public Employee(String name, double salary, String hireDay){
		  this.name = name;
	      this.salary = salary;
	      this.hireDay = hireDay;
	  }

		public void getEmployeeData(){
		   System.out.println("name="+name+","+"salary="+salary+","+"hireDay="+hireDay);
		 }
		
		public void RaiseSalary()
		{
			salary = salary + salary *5/100;
		}
		
}
