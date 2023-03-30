package selenium.Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question5 {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//create an instance of web driver interface
	    WebDriver driver;
	    //creating obj of chrome driver class
	    driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	   
		/*
		 * // call scrolldown utility SeleniumUtils.scrollDown(driver);
		 */
	    WebElement RadioButton = driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[2]"));
 		
		
		  // Scrolling down the page till the element is found 
	      JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", RadioButton);
		  Thread.sleep(2000);
		 
	 		
	    RadioButton.click();
		//driver.close();
	}

}
