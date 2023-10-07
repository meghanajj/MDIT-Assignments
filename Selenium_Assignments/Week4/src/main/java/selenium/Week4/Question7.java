package selenium.Week4;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Question7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//create instance of web driver
		WebDriver driver;
		driver = new ChromeDriver(co);
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//get url
		driver.manage().window().maximize();
		driver.get("https://hms.techcanvass.co/");
		
		//Implicit wait - driver will wait for all the webelements to be load 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Inspect Login ID field
		WebElement loginID = driver.findElement(By.id("txtUserName"));
		loginID.sendKeys("Pradnya");
		
		//Thread.sleep - execution of the program will wait for specified time
		Thread.sleep(3000);
		//Inspect Password field
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys("1994");
		
		//Explicit wait - Make the driver wiat until the specified webelement is available
		WebElement staySignin = new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.elementToBeClickable(By.id("chkstaysignedin")));
		staySignin.click();
				
		//Fluent wait - make driver wait for specified time period with polling time
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(30L))
			 .pollingEvery(Duration.ofSeconds(5L))
			 .ignoring(NoSuchElementException.class);

			 WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
			 public WebElement apply(WebDriver driver) {
			 return driver.findElement(By.id("LoginButton"));
			               }
			 });
		 loginButton.click();
		 driver.quit();
		
	}

}
