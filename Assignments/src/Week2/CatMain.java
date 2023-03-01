package Week2;

public class CatMain {
	public static void main(String[] args) {
		
		//create instance of class and declare the attribute as 50
		Cat cat = new Cat(50, 50, 50);
		//call the methods
		cat.sleepAction();
		cat.playAction();
		cat.eatAction();
		cat.digestAction();
		
		cat.getIndeices();
	}

}
