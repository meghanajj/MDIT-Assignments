package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

/**
 * Page Object encapsulates the Login page.
 */
public class LoginPage extends TestBase {

    public static Logger log = Logger.getLogger(LoginPage.class.getName());

    /**
     * Page Objects
     */
    @FindBy(css = "input[name='text']")
    WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//span[text()='Next']/../../..")
    WebElement nextButton;
    @FindBy(xpath = "//h2/span")
    WebElement homeLabel;

    /**
     * Initialize PageFactory Elements
     */
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get("https://twitter.com/i/flow/login");
        driver.navigate().refresh();
        waitForPageLoad();
    }

    public void login(String userName, String pwd) {
        utils.click(username, "Username");
        utils.click(username, "Username");
        utils.sendKeys(username, "Username", userName);
        utils.click(nextButton, "Next");
        utils.sendKeys(password, "Password", pwd);
    }

    public void validateHomePageAfterLogin() {
        Assert.assertEquals(homeLabel.getText().trim(), "Home");
    }

    public void clickOnLoginButton() {
        password.sendKeys(Keys.ENTER);
    }
}