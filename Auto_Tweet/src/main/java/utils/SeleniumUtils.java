package utils;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    static int TIMEOUT = 20;
    static int IMPLICIT = 20;
    static int EXPLICIT = 20;
    private WebDriver driver;
    public static Logger log = Logger.getLogger(SeleniumUtils.class.getName());

    public SeleniumUtils() {
        this.driver = TestBase.driver;
    }

    public void click(WebElement element, String elementName) {
        if (customSync(element, "VisibilityOfElementLocated")) {
            element.click();
            log.info("Clicked on " + elementName);
        }
    }

    public void sendKeys(WebElement element, String elementName, String value) {
        if (customSync(element, "VisibilityOfElementLocated") && customSync(element, "ElementToBeClickable")) {
            element.sendKeys(value);
            log.info("Entered value on " + elementName + " field");
        } else log.error(elementName + " not visible nor clickable");
    }

    public boolean customSync(WebElement webElement, String waitType) {
        try {
            WebDriverWait waitObj = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT));
            switch (waitType) {
                case "VisibilityOfElementLocated":
                    waitObj.until(ExpectedConditions.visibilityOf(webElement));
                    break;
                case "ElementToBeClickable":
                    waitObj.until(ExpectedConditions.elementToBeClickable(webElement));
                    break;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void clearAndSendKeys(WebElement webElement, String elementName, String valueToEnter) {
        webElement.clear();
        webElement.sendKeys(valueToEnter);
        log.info("Entered value on " + elementName + " field");
    }
}
