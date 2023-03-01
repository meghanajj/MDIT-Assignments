package Week2;

public class BankMain {

	public static void main(String[] args) {
		
		MasterBank mBank = new MasterBank();
		BankA BankA = new BankA();
		BankB BankB = new BankB();
		BankC BankC = new BankC();
		
		mBank.getInterest();
		BankA.getInterest();
		BankB.getInterest();
		BankC.getInterest();
		
	}
}
