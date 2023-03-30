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
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//create an instance of web driver interface
	    WebDriver driver;
	    //creating obj of chrome driver class
	    driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    
	    List<WebElement> CheckboxList = driver.findElements(By.xpath("//form[contains(text(),'My favourite colors are:')]"));
	    
	    for(WebElement checkbox : CheckboxList) {
	        System.out.println(checkbox.getText());
	    }
	    
	    WebElement RadButton = driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]"));
		
		   // Scrolling down the page till the element is found		
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", RadButton);
	    
	    List<WebElement> RadioButtonList = driver.findElements(By.xpath("//form[contains(text(),'Your current web browser is:')]"));
	     
	    for(WebElement RadioButton : RadioButtonList) {
	        System.out.println(RadioButton.getText());
	    }
		
	}

}
