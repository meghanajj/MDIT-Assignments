package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Page Object encapsulates the Home page.
 */
public class HomePage extends TestBase {

    public static Logger log = Logger.getLogger(HomePage.class.getName());

    /**
     * Page Objects
     */
    @FindBy(xpath = "//input[@aria-label='Search query']")
    WebElement searchTextBox;

    @FindBy(xpath = "//h2/span")
    WebElement homeLabel;

    @FindBy(xpath = "//div[@data-testid='tweetText']/../..")
    List<WebElement> fullTweet;

    /**
     * Initialize PageFactory Elements
     */
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void searchTwitter(String searchTerm) {
        utils.clearAndSendKeys(searchTextBox, "Search Text Box", searchTerm);
        searchTextBox.sendKeys(Keys.ENTER);
    }

    public void clickResult() {
        //   utils.click(firstSearchResult, "First Search Result");
    }

    public void retrieveFilteredTweets(int hours) {
        int totalTweets = getTotalTweets();
        getTweetTimeStampAndText(hours, totalTweets);
    }

    private List<String> getTweetTimeStampAndText(int hours, int totalTweets) {
        List<String> tweetList = new LinkedList<>();
        for (int i = 0; i < totalTweets; i++) {
            String xpathTimestamp = "(//a[@role='link']/time)[" + (i + 1) + "]";
            String timeStamp = fullTweet.get(i).findElement(By.xpath(xpathTimestamp)).getText().trim();
            log.info("timeStamp of retrieved tweet : " + timeStamp);

            if (!(timeStamp.endsWith("h") && Integer.valueOf(extractHourValue(timeStamp)) > hours)) {
                String xpathTweetText = "(//div[@data-testid='tweetText'])[" + (i + 1) + "]";
                String tweetText = fullTweet.get(i).findElement(By.xpath(xpathTweetText)).getText().trim();
                tweetList.add(tweetText);
                log.info("timeStamp of retrieved tweet : " + tweetText);
            }
        }
        return tweetList;
    }

    private int getTotalTweets() {
        int totalTweets = fullTweet.size();
        log.info("Total Tweets Available: " + totalTweets);
        return totalTweets;
    }

    public String validatePartUrl(String partUrl) {
        return driver.getCurrentUrl().trim();
    }

    public static String extractHourValue(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

    public void splitFilteredTweets(int hours) {
        int totalTweets = getTotalTweets();
        List<String> tweetList = getTweetTimeStampAndText(hours, totalTweets);
        for (String tweet : tweetList) {
            log.info("Splitting Tweet: " + tweet);
            List<String> finalSplitStrings = new LinkedList<>();
            if (tweet.length() > 50) {
                List<String> allSplitParts = splitEqually(tweet, 50);
                for (int i = 1; i <= allSplitParts.size(); i++) {
                    finalSplitStrings.add(allSplitParts.get(i - 1) + " ..." + i + " of " + allSplitParts.size());
                }
                log.info("Tweet after Split: " + finalSplitStrings);
            }
        }
    }

    public static List<String> splitEqually(String text, int size) {
        List<String> splitList = new ArrayList<String>((text.length() + size - 1) / size);
        for (int start = 0; start < text.length(); start += size) {
            splitList.add(text.substring(start, Math.min(text.length(), start + size)));
        }
        return splitList;
    }
}