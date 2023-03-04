package Week2;

public class Addition {
	static //declare variables
	float total;
	  float param1;
	  float param2;
	  float param3;
	 //method signature with 2 parameters
	public static void ParamSum(float param1 , float param2) {
		total = param1 + param2;
		System.out.println("The sum of two parameter is "+total);
	}
	//method signature with 3 parameters
	public static void ParamSum(float param1 , float param2, float param3) {
		total = param1 + param2 + param3;
		System.out.println("The sum of three parameter is "+total);
	}

}
