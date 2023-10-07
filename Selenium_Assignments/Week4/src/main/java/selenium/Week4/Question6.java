package selenium.Week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question6 {
	
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
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    
	   //get the path of checkbox and save them as list of webelements
	    List<WebElement> CheckboxList = driver.findElements(By.xpath("//form[contains(text(),'My favourite colors are:')]"));
	    
	    //using for loop print each text of the checkbox
	    for(WebElement checkbox : CheckboxList) {
	        System.out.println(checkbox.getText());
	    }
	    
	    //get the path of radiobutton and save them as list of webelements
	    List<WebElement> RadioButtonList = driver.findElements(By.xpath("//form[contains(text(),'Your current web browser is:')]"));
 
        //using for loop print each text of the radio button
	    for(WebElement RadioButton : RadioButtonList) {
	        System.out.println(RadioButton.getText());
	    }

	    //close the driver at the end 
	  	driver.close();
		
	}

}
