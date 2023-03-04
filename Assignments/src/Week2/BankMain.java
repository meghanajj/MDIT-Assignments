package Week2;

public class BankMain {

	public static void main(String[] args) {
		
		MasterBank mBank = new MasterBank();
		BankA BankA = new BankA();
		BankB BankB = new BankB();
		BankC BankC = new BankC();
		
		
		System.out.println("MasterBank-"+mBank.getInterest());
		System.out.println("BankA-"+BankA.getInterest());
		System.out.println("BankB-"+BankB.getInterest());
		System.out.println("BankC-"+BankC.getInterest());
		
	}
}

