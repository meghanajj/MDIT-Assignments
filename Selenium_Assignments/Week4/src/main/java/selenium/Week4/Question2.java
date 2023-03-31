package selenium.Week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// create an instance of web driver interface
		WebDriver driver;
		// creating obj of chrome driver class
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(" https://jqueryui.com/selectmenu/");

//		// call scrolldown utility
		
//		SeleniumUtils.scrollDown(driver);
		
		//search for frame and switch to frame WebElement Frame =
		WebElement Frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame);
		
		WebElement speed = driver.findElement(By.xpath("//span[@id='speed-button']")); 
		speed.click();
		//instantiate action
		Actions actions = new Actions(driver);
		actions.click(speed);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		//title
		WebElement title = driver.findElement(By.id("salutation-button")); 
		title.click();
		actions.click(title);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		//number
		WebElement number = driver.findElement(By.id("number-button")); 
		number.click();
		actions.click(number);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		//Files
		WebElement file = driver.findElement(By.id("files-button")); 
		file.click();
		actions.click(file);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		
		//span[@id='speed-button']
		/*
		 * //search for frame and switch to frame WebElement Frame =
		 * driver.findElement(By.className("demo-frame"));
		 * driver.switchTo().frame(Frame);
		 * 
		 * WebElement speed = driver.findElement(By.id("speed-button")); speed.click();
		 * 
		 * Select speedOption = new Select(speed); speedOption.selectByIndex(2);
		 * 
		 * 
		 * WebElement speedOption =
		 * driver.findElement(By.xpath("//div[@id='ui-id-5']")); speedOption.click();
		 * 
		 * WebElement salutation = driver.findElement(By.id("salutation-button"));
		 * salutation.click();
		 * 
		 * Select salOption = new Select(salutation); // salOption.deselectAll();
		 * salOption.selectByVisibleText("Dr.");
		 */
		
		
	}

}
