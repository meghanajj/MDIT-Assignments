package Week2;

public class Cat {
	//declare the variables
	int moodIndex, energyIndex,hungerIndex;
	//constructor
	public Cat(int moodIndex, int energyIndex, int hungerIndex) {
		this.moodIndex = moodIndex;
		this.energyIndex = energyIndex;
		this.hungerIndex = hungerIndex;
	}
	//method for sleep action
	public void sleepAction() {
		energyIndex= energyIndex + 10;
	}
	//method for play action
	public void playAction() {
	    moodIndex= moodIndex +10;
	    hungerIndex= hungerIndex +5;
	    energyIndex= energyIndex -20;
	}
	//method for eat action
	public void eatAction() {
		energyIndex= energyIndex + 20;
	}
	//method for digest action
	public void digestAction(){
		moodIndex = moodIndex + 5;
	}
	//method to get all indices 
	public void getIndeices() {
		System.out.println("Energy Index = "+energyIndex +", Mood Index = "+moodIndex+", Hunger Index = "+hungerIndex);
	}
}
