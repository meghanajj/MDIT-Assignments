package selenium.Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question3 {
	
	public static void main(String[] args) {
		
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
        
        driver.close();
		
	}

}
