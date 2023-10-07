package selenium.Week4;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Question4 {
	
	 public static void takeScreenShot(WebDriver webdriver,String fileWithPath) throws Exception{

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
		
       //use chrome options to resolve web socket issue
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
    	//create an instance of web driver interface
        WebDriver driver;
        
        //creating obj of chrome driver class
        driver = new ChromeDriver(co);
        //Maximise the window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        
		//find each color using the xpath and click
        driver.findElement(By.xpath("//input[@value='red']")).click();
        driver.findElement(By.xpath("//input[@value='yellow']")).click();
        driver.findElement(By.xpath("//input[@value='green']")).click();
        
        //take screenshot using the method
        takeScreenShot(driver,generateDateTime());
        Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save("screenshots");

        //quit the driver
        driver.quit();

	 }
		           
	private static String generateDateTime() {
        String pattern = "MMddyyyy_HHmmss";

        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();        
        String todayAsString = df.format(today);

        String screenShotFileName = "SS_" + todayAsString + ".PNG";
        return screenShotFileName;
		        
	 }
 }
