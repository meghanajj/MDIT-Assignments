package selenium.Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question1 {

	    public static void main(String[] args) throws InterruptedException {
	    	
	    	ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
	    	//create an instance of web driver interface
	        WebDriver driver;
            //creating obj of chrome driver class
	        driver = new ChromeDriver(co);
	        driver.manage().window().maximize();
	        driver.get("https://jqueryui.com/datepicker/#buttonbar");
	        
	        //search for frame and switch to frame
	        WebElement Frame = driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(Frame);
			
	        //select the date picker
	        WebElement datePicker = driver.findElement(By.className("hasDatepicker"));
	        datePicker.click();
	        //select the date and click
	        WebElement date = driver.findElement(By.xpath("//td/a[text()='21']"));
	        date.click();

	        driver.quit();
	    }

	
}