package selenium.Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question3 {
	
	public static void main(String[] args) {
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
        
        //close the driver
        driver.close();
		
	}

}
