package selenium.Week4;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question4 {
	
	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot
		 	TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file
		 	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	        //Move image file to new destination
		 	File DestFile=new File(fileWithPath);

	        //Copy file at destination
		 	FileUtils.copyFile(SrcFile, DestFile);

	    }
	
	public static void main(String[] args) throws Exception {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//create an instance of web driver interface
	    WebDriver driver;
	    //creating obj of chrome driver class
	    driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
	    driver.findElement(By.xpath("//input[@value='red']")).click();
	    driver.findElement(By.xpath("//input[@value='yellow']")).click();
	    driver.findElement(By.xpath("//input[@value='green']")).click();
		
	    takeSnapShot(driver, "SSFile.PNG");
	    
	}

}

