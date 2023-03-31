package selenium.Week4;

import java.time.Duration;

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
		
		//Disable Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//explicit wait
		WebElement login = new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtUserName']")));
		
		login.sendKeys("Pradnya");
		

		//Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(200));
		
		WebElement password = wait.until(new Function<WebDriver, WebElement>() 
		{
		    public WebElement apply(WebDriver driver) {
		    return driver.findElement(By.xpath("//input[@id='txtPassword']"));
		}
		});
		
		password.sendKeys("1947");
		
		//Hardcore WAIT
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='chkstaysignedin']"));
		checkbox.click();
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='LoginButton']"));
		loginButton.click();
		
		//driver.close();
		
		
		
		
	}

}
