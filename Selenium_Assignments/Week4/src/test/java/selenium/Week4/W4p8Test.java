package selenium.Week4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class W4p8Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeMethod
public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterMethod
public void tearDown() {
    driver.quit();
  }
  @Test
  public void W4p8Test() {
    driver.get("https://www.google.co.in/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    driver.findElement(By.id("APjFqb")).sendKeys("automation testing seelenium");
    driver.findElement(By.cssSelector("#jZ2SBf b")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".g:nth-child(12) .LC20lb"));
      assert(elements.size() > 0);
    }
  }
}
