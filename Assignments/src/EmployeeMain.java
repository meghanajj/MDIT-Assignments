class EmployeeMain{
	
   public static void main(String args[]){
	   
     //create array of employee object  
    Employee[] emp = new Employee[3] ;
 
     //create & initialize actual employee objects using constructor
     emp[0] = new Employee("Carl Cracker",78750.0,"1987-12-15");
     emp[1] = new Employee("Harry Hacker",52500.0,"1989-10-01");
     emp[2] = new Employee("Tony Tester",42000.0,"1990-03-15");
 
     //display the employee object data
     emp[0].getEmployeeData();
     emp[1].getEmployeeData();
     emp[2].getEmployeeData();
     
     //Raise salary
     System.out.println("Salary incremented by 5%");
     emp[0].RaiseSalary();
     emp[1].RaiseSalary();
     emp[2].RaiseSalary();
     
     //display the employee object data
     emp[0].getEmployeeData();
     emp[1].getEmployeeData();
     emp[2].getEmployeeData();
     
     
  }
   
   
  
}