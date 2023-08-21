import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args)
	{
		//enter the initial investment
		System.out.print("What is your initial investment? ");
		
		Scanner x = new Scanner(System.in);
		double initialInvest = x.nextInt();
		//store the rates in an array
		double rates[]= {10.0,11.0,12.0,13.0,14.0,15.0};
		//store the amounts at each rates in a 2d array
		double amt[][]=new double[100][100];
		
		int i,j;
		//using loop iterate over the rates
		for (i=0;i<rates.length; i++ )
		{
			
			System.out.print(rates[i]);
			System.out.print("%		");
		}
		
		System.out.println("");
		//using the rates from the above for loop iterate over the amount thats calculated
		for (i=0;i<10; i++ )
		{
			
			for (j=0;j<6;j++)
			{
				
				if(i==0)
				{
					amt[i][j] = initialInvest;
				}
				else
				{
					amt[i][j]=(amt[i-1][j]+amt[i-1][j]*rates[j]/100);
				}
				
				System.out.printf("%.2f",amt[i][j]);
				System.out.print("	");
			}
			
			System.out.println("");
		}	
		
		
	}

}