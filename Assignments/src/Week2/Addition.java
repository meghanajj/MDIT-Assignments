package Week2;

public class Addition {
	//declare variables
	float total;
	 static float param1;
	 static float param2;
	 static float param3;
	 //method signature with 2 parameters
	public void ParamSum(float param1 , float param2) {
		total = param1 + param2;
		System.out.println("The sum of two parameter is "+total);
	}
	//method signature with 3 parameters
	public void ParamSum(float param1 , float param2, float param3) {
		total = param1 + param2 + param3;
		System.out.println("The sum of three parameter is "+total);
	}

}
