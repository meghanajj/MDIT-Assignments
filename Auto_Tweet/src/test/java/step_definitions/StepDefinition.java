package step_definitions;


import org.apache.log4j.Logger;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import utils.TestBase;

import java.util.Map;

public class StepDefinition extends LoginPage {

    public static Logger log = Logger.getLogger(StepDefinition.class.getName());
    LoginPage login;
    HomePage homePage;
    ProfilePage profilePage;
    String scenarioName = "";

    @Before
    public void setUp(Scenario scenario) {
        TestBase.configureLoggingProperties();
        TestBase.loadDataProperties();
        scenarioName = scenario.getName();
        log.info("Scenario : " + scenarioName);
        TestBase.initializeDriver();
        login = new LoginPage();
        profilePage = new ProfilePage();
        homePage = new HomePage();
    }

    @After
    public void tearDown() {
        TestBase.driver.quit();
        log.info("Scenario : ".concat(scenarioName).concat(" Completed"));
    }

    @Given("user navigates to twitter login page")
    public void user_navigates_to_twitter_login_page() {
        login.navigateToLoginPage();
        log.info("Navigated to Twitter Login Page");

    }

    @When("user inputs login credentials")
    public void user_inputs_login_credentials() {
        login.login(properties.getProperty("userid"), properties.getProperty("pass"));
        log.info("Entered Username and password");
    }

    @And("presses enter key to login into account")
    public void presses_enter_key_to_login_into_account() {
        login.clickOnLoginButton();
        log.info("Navigating to Home Page after Login");
    }

    @Then("user logs in successfully and home page is visible")
    public void user_logs_in_successfully_and_home_page_is_visible() {
        login.validateHomePageAfterLogin();
        log.info("On User's Home Page post Login");
    }

    //Profile Page methods
    @Given("user is logged in on twitter")
    public void user_is_logged_in_on_twitter() throws Exception {
        login.navigateToLoginPage();
        login.login(properties.getProperty("userid"), properties.getProperty("pass"));
        login.clickOnLoginButton();
    }

    @Given("user clicks on profile page hyperlink")
    public void user_clicks_on_profile_page_hyperlink() {
        profilePage.navigateToProfilePage();
    }

    @When("user clicks on edit profile button")
    public void user_clicks_on_edit_profile_button() {
        profilePage.clickEditProfile();
    }

    @Then("user updates the profile picture")
    public void user_updates_the_profile_picture() {
        profilePage.updateProfilePicture();
    }

    @Then("user updates Bio data as {string}")
    public void user_updates_bio_data_as(String bioString) throws InterruptedException {
        profilePage.updateBioData(bioString);
    }

    @Then("user updates Location as {string}")
    public void user_updates_location_as(String locString) {
        profilePage.updateLocation(locString);
    }

    @Then("user updates Website as {string}")
    public void user_updates_website_as(String webString) {
        profilePage.updateWebsite(webString);
    }

    @Then("profile data is validated as")
    public void profile_data_is_validated_as(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String actualResult = profilePage.validateProfilePageData(key);
            String expectedResult = value;
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @When("{string} is searched using search functionality")
    public void is_searched_using_search_functionality(String searchTerm) {
        homePage.searchTwitter(searchTerm);
    }

    @When("first search result is clicked")
    public void first_search_result_is_clicked() {
        homePage.clickResult();
    }

    @Then("tweets published in last {string} hours are retrieved and printed on console")
    public void tweets_published_in_last_hours_are_retrieved_and_printed_on_console(String hoursStr) throws InterruptedException {
        int hours = Integer.valueOf(hoursStr);
        homePage.scrollDown(10000);
        homePage.retrieveFilteredTweets(hours);
    }


    @Then("Validate if required page with text {string} in url is loaded")
    public void validateIfRequiredPageWithTextInUrlIsLoaded(String partUrl) {
        String actual = homePage.validatePartUrl(partUrl);
        System.out.println("actual = " + actual);
        Assert.assertTrue(actual.contains(partUrl));
    }

    @And("tweets published in last {string} hours are retrieved and split")
    public void tweetsPublishedInLastHoursAreRetrievedAndSplit(String hoursStr) throws InterruptedException {
        int hours = Integer.valueOf(hoursStr);
        homePage.scrollDown(10000);
        homePage.splitFilteredTweets(hours);
    }
}