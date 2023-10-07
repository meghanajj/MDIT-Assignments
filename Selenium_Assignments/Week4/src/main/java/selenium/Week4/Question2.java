package selenium.Week4;

import java.time.Duration;
import java.util.NoSuchElementException;

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

	public static void main(String[] args) {
		
		//use chrome options to resolve web socket issue
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// create an instance of web driver interface
		WebDriver driver;
		// creating obj of chrome driver class
		driver = new ChromeDriver(co);
		//maximise the window
		driver.manage().window().maximize();
		//get the url 
		driver.get(" https://jqueryui.com/selectmenu/");
		
		//give a implicit wait for every operation
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		//search for frame and switch to frame 
		WebElement Frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Frame);
		
		try {
				
				//get the webelement to be clicked using their xpath
				WebElement speed = driver.findElement(By.xpath("//span[@id='speed-button']")); 
				speed.click();
				//instantiate action
				Actions actions = new Actions(driver);
				actions.click(speed);
				//using sendkeys arrow down or up to be used and using the method build and perform, the click on the keys is done
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				
				//title , create action and using send keys perform the click
				WebElement title = driver.findElement(By.id("salutation-button")); 
				title.click();
				actions.click(title);
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				
				//number, create action and using send keys perform the click
				WebElement number = driver.findElement(By.id("number-button")); 
				number.click();
				actions.click(number);
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				
				//Files, create action and using send keys perform the click
				WebElement file = driver.findElement(By.id("files-button")); 
				file.click();
				actions.click(file);
				actions.sendKeys(Keys.ARROW_DOWN).build().perform();
				
		}
		
		catch (NoSuchElementException e) {
			
			System.out.println(e);
		}
		
		//close the driver at the end 
		driver.close();
		
		
	}

}
