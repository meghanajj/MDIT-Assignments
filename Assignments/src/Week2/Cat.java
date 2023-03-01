package Week2;

public class Cat {
	//declare the variables
	int mIndex, eIndex,hIndex;
	//constructor
	public Cat(int mIndex, int eIndex, int hIndex) {
		this.mIndex = mIndex;
		this.eIndex = eIndex;
		this.hIndex = hIndex;
	}
	//method for sleep action
	public void sleepAction() {
		eIndex= eIndex + 10;
	}
	//method for play action
	public void playAction() {
	    mIndex= mIndex +10;
	    hIndex= hIndex +5;
	    eIndex= eIndex -20;
	}
	//method for eat action
	public void eatAction() {
		eIndex= eIndex + 20;
	}
	//method for digest action
	public void digestAction(){
		mIndex = mIndex + 5;
	}
	//method to get all indices 
	public void getIndeices() {
		System.out.println("Energy Index = "+eIndex +", Mood Index = "+mIndex+", Hunger Index = "+hIndex);
	}
}
