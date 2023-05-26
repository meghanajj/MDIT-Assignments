package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

/**
 * Page Object encapsulates the Profile page.
 */
public class ProfilePage extends TestBase {

    public static Logger log = Logger.getLogger(ProfilePage.class.getName());

    /**
     * Page Objects
     */
    @FindBy(xpath = "//span[text()='Profile']")
    WebElement profileHyperLink;
    @FindBy(xpath = "//span[text()='Edit profile']")
    WebElement editProfileButton;
    @FindBy(xpath = "//div[@aria-label='Add avatar photo']/following-sibling::input")
    WebElement profilePhotoIcon;
    @FindBy(xpath = "//span[text()='Apply']")
    WebElement applyButton;
    @FindBy(xpath = "//span[text()='Save']")
    WebElement saveButton;
    @FindBy(xpath = "//textarea[@name='description']")
    WebElement bioTextArea;
    @FindBy(xpath = "//input[@name='location']")
    WebElement locationTextBox;
    @FindBy(xpath = "//input[@name='url']")
    WebElement websiteTextBox;

    /**
     * Initialize PageFactory Elements
     */
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToProfilePage() {
        utils.click(profileHyperLink, "Profile Button");
    }

    public void clickEditProfile() {
        utils.click(editProfileButton, "Edit Profile Button");
    }

    public void updateProfilePicture() {
        String profilePicturePath = System.getProperty("user.dir") + "\\src\\test\\resources\\artifacts\\profilePicture.png";
        profilePhotoIcon.sendKeys(profilePicturePath);
        utils.click(applyButton, "Apply Button");
        utils.click(saveButton, "Save Button");
    }

    public void updateLocation(String locationString) {
        utils.clearAndSendKeys(locationTextBox, "Location", locationString);
        utils.click(saveButton, "Save Button");
    }

    public void updateWebsite(String webString) {
        utils.clearAndSendKeys(websiteTextBox, "WebSite", webString);
        utils.click(saveButton, "Save Button");
    }

    public void updateBioData(String bioString) throws InterruptedException {
        utils.clearAndSendKeys(bioTextArea, "Bio Data", bioString);
        utils.click(saveButton, "Save Button");
        Thread.sleep(10000);
    }

    public String validateProfilePageData(String field) {
        String xpathString = "//*[@data-testid='" + field + "']";
        utils.customSync(driver.findElement(By.xpath(xpathString)), "VisibilityOfElementLocated");
        return driver.findElement(By.xpath(xpathString)).getText().trim();
    }
}
